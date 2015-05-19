/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function nuevaMina(){
        $.ajax({
        type: "POST",
        url: "nuevaMina.jsp",
        success: function (msg) {
            $('#output').empty();
            $('#output').html(msg);
        }
    });
}


function mostrarRegistro() {
    $.ajax({
        type: "POST",
        url: "form_registro.jsp",
        success: function (msg) {
            $('#formularios').empty();
            $('#formularios').html(msg);
        }
    });
}

function mostrarLogin() {
    $.ajax({
        type: "POST",
        url: "form_login.jsp",
        success: function (msg) {
            $('#formularios').empty();
            $('#formularios').html(msg);
        }
    });
}

function mostrarErrorLogin(){
    //codigo
}