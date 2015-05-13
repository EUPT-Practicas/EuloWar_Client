/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endpoints;

import cliente_webservice.ClienteRecursosMinas;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author FranciscoJavier
 */
@ServerEndpoint("/recursosendpoint")
public class recursosEndpoint {

    private static Set<Session> peers = Collections.synchronizedSet(new HashSet<Session>());

    @OnOpen
    public void onOpen(Session peer) {
        System.out.println("open endporint" + peer);
        peers.add(peer);
    }

    @OnClose
    public void onClose(Session peer) {
        System.out.println("close endopint");
        peers.remove(peer);
    }

    @OnMessage
    public void obtenerRecursos(final String email, Session session) throws IOException, EncodeException {
        for (final Session peer : peers) {
            if (!peer.equals(session)) {
                //LLAMADA AL WEBSERVICE PARA OBTENER LOS RECURSOS
                //peer.getBasicRemote().sendObject(figure);

                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        ClienteRecursosMinas crm = new ClienteRecursosMinas();
                        System.out.println("email: " + email);
                        System.out.println("actualizados recursos");

                        int recursos = crm.obtenerRecursos(email);
                        String recursoString = Integer.toString(recursos);
                        try {
                            peer.getBasicRemote().sendText(recursoString);
                        } catch (IOException ex) {
                            Logger.getLogger(recursosEndpoint.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                };
                Timer timer = new Timer();
                // Dentro de 0 milisegundos, avísame cada x  milisegundos
                timer.scheduleAtFixedRate(timerTask, 0, 5000);
            }
        }
    }

}
