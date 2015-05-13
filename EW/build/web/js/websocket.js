/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var wsURI = "ws://" + document.location.host + document.location.pathname + "recursosendpoint";
var websocket = new WebSocket(wsURI);

websocket.onerror = function(evt) { onError(evt); };

function onError(evt) {
    writeToScreen('<span style="color: red;">ERROR:</span> ' + evt.data);
}

websocket.onmessage = function(evt) { onMessage(evt); };

function sendText(email) {
    console.log("sending text: " + email);
    console.log(wsURI);
    websocket.send(email);
}
                
function onMessage(evt) {
    console.log("received: " + evt.data);
    //DIBUJAR LOS VALORES EN SU SITIO HIERRO: ....
}


