/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_webservice;

import clientes_WS.Usuario;

/**
 *
 * @author FranciscoJavier
 */
public class ClienteRegistroAuth {
    
    public ClienteRegistroAuth(){
        
    }

    public boolean asignarMina(java.lang.String emailUsuario) {
        webservices.AsignarRecursosInicio_Service service = new webservices.AsignarRecursosInicio_Service();
        webservices.AsignarRecursosInicio port = service.getAsignarRecursosInicioPort();
        return port.asignarMina(emailUsuario);
    }

    public boolean asignarRecursos(java.lang.String email) {
        webservices.AsignarRecursosInicio_Service service = new webservices.AsignarRecursosInicio_Service();
        webservices.AsignarRecursosInicio port = service.getAsignarRecursosInicioPort();
        return port.asignarRecursos(email);
    }

    public boolean comprobarLogin(java.lang.String nombreUsuario, java.lang.String password) {
        clientes_WS.ServiceRegistroAutenticacion_Service service = new clientes_WS.ServiceRegistroAutenticacion_Service();
        clientes_WS.ServiceRegistroAutenticacion port = service.getServiceRegistroAutenticacionPort();
        return port.comprobarLogin(nombreUsuario, password);
    }

    public boolean crearUsuario(java.lang.String email, java.lang.String nombreUsuario, java.lang.String password) {
        clientes_WS.ServiceRegistroAutenticacion_Service service = new clientes_WS.ServiceRegistroAutenticacion_Service();
        clientes_WS.ServiceRegistroAutenticacion port = service.getServiceRegistroAutenticacionPort();
        return port.crearUsuario(email, nombreUsuario, password);
    }

    public Usuario findUser(java.lang.String nomUsuario) {
        clientes_WS.ServiceRegistroAutenticacion_Service service = new clientes_WS.ServiceRegistroAutenticacion_Service();
        clientes_WS.ServiceRegistroAutenticacion port = service.getServiceRegistroAutenticacionPort();
        return port.findUser(nomUsuario);
    }
    
    
    
}
