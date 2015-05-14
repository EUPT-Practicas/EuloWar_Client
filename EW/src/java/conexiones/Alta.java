/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import Utilidades.EncriptaMD5;
import asignarRecursos_WS.Mina;
import cliente_webservice.ClienteRecursosMinas;
import cliente_webservice.ClienteRegistroAuth;
import clientes_WS.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import threadsTiempo.GestorThreads;

/**
 *
 * @author Ricardo
 */
public class Alta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");

            ClienteRegistroAuth cra = new ClienteRegistroAuth();

            boolean exitoRegistro = false;
            boolean exitoRecursos = false;
            Usuario usuario;

            //Recoger los datos del formulario.
            String email = request.getParameter("email");
            String nombreUsuario = request.getParameter("nombreUsuario");
            String password = request.getParameter("password");
            String passwordRepit = request.getParameter("passwordRepit");
            System.out.println(email + nombreUsuario + password);

//        if(password.equals(passwordRepit)){
//            //System.out.println( email + " "+ nombre + " "+ password + " "+ passwordRepit);
//            System.out.println("\t\t - El resultado es: " + crearUsuario(email, nombre, password));
//        } 
            //Si los datos NO son vacios
            //Comprobamos las password
            if (password.equals(passwordRepit)) {
                //Llamada al WS
                String passEncript = EncriptaMD5.encriptarClave(password, nombreUsuario);
                exitoRegistro = cra.crearUsuario(email, nombreUsuario, passEncript);
                if (exitoRegistro) {

                    exitoRecursos = cra.asignarRecursos(email);
                    Mina m = cra.asignarMina(email);
                    if (exitoRecursos) {
                        usuario = (Usuario) cra.findUser(nombreUsuario);
                        System.out.println("asignados mina y recursos");

                        GestorThreads g = GestorThreads.getInstance();
                        g.crearThread(m);

                        HttpSession nuevaSesion = request.getSession();
                        nuevaSesion.setAttribute("usuario", usuario);
                        
//                        ClienteRecursosMinas crm = new ClienteRecursosMinas();
//                        System.out.println("RECURSOSOSOSOSOSOSOSOSOOS: " + crm.obtenerRecursos(email));

                        response.sendRedirect("general.jsp");
                        System.out.println("pepe");
                    } else {
                        System.out.println("no asignados ");
                    }
                    System.err.println("USUARIO REGISTRADO CORRECTAMENTE");
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //System.out.println("DOPOST++++++++++++++++++++++++++++");
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>  

}
