/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Utilidades.EncriptaMD5;
import clients.ServiceRegistroAutenticacion_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Ricardo
 */
public class Login extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServiceRegistroAutenticacion/ServiceRegistroAutenticacion.wsdl")
    private ServiceRegistroAutenticacion_Service service;

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        //processRequest(request, response);
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
        processRequest(request, response);
        request.setCharacterEncoding("UTF-8");
        
        boolean exitoLogin = false;
        
        //Recoger los datos del formulario.
        String nombreUsuario = request.getParameter("nombre");
        String password = request.getParameter("password");
        
        System.out.println("nom: " + nombreUsuario);
        System.out.println("pass: " + password);
//        System.out.println("el nombre es " + nombre + " con passs " + password);
//        
//        System.out.println("¿El usuario entra?: " + comprobarLogin(nombre, password) );
        
        if(!nombreUsuario.isEmpty() && nombreUsuario != null
                && !password.isEmpty() && password != null){
            String encriptada = EncriptaMD5.encriptarClave(password, nombreUsuario);
            System.out.println("encriptada: " + encriptada);
            exitoLogin = comprobarLogin(nombreUsuario, encriptada);
            }
        
        if(exitoLogin){
            System.err.println("EL USUARIO EXISTE");
        }else{
            System.err.println("EL USUARIO NO EXISTE, o datos vacios");
        }
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

    private boolean comprobarLogin(java.lang.String email, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clients.ServiceRegistroAutenticacion port = service.getServiceRegistroAutenticacionPort();
        return port.comprobarLogin(email, password);
    }


}
