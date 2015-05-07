/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_webservice;

/**
 *
 * @author FranciscoJavier
 */
public class ClienteRecursosMinas {

    public boolean producirRecursos(int idMina) {
        threads_recursosMina.ProducirRecursosMina_Service service = new threads_recursosMina.ProducirRecursosMina_Service();
        threads_recursosMina.ProducirRecursosMina port = service.getProducirRecursosMinaPort();
        return port.producirRecursos(idMina);
    }
    
}
