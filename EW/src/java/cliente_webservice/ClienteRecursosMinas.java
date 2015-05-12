/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_webservice;

import operacionesminas_client.Mina;

/**
 *
 * @author FranciscoJavier
 */
public class ClienteRecursosMinas {

    public boolean producirRecursos(int idMina) {
        operacionesminas_client.ProducirRecursosMina service = new operacionesminas_client.ProducirRecursosMina();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.producirRecursos(idMina);
    }

    public boolean mejorarMina(int idMina) {
        operacionesminas_client.ProducirRecursosMina service = new operacionesminas_client.ProducirRecursosMina();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.mejorarMina(idMina);
    }

    public Mina asignarMina(java.lang.String emailUsuario) {
        operacionesminas_client.ProducirRecursosMina service = new operacionesminas_client.ProducirRecursosMina();
        operacionesminas_client.OperacionesMinas port = service.getOperacionesMinasPort();
        return port.asignarMina(emailUsuario);
    }
  
}
