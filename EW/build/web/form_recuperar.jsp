<%-- 
    Document   : form_recuperar
    Created on : 01-jun-2015, 18:16:26
    Author     : Ricardo
--%>
<!-- Formulario de recuperar contrase�a -->
<form action="Recuperar" method="POST">
    <h3 class="text-center">
        <b>Restablecer contrase�a</b>
    </h3>
    <h5 class="text-center">
        Introduce tu correo electr�nico el cual usaste para registrarte. Te enviaremos un correo electr�nico con tu nombre de usuario y un enlace para restablecer tu contrase�a.
    </h5>
    
    <div class="form-group">
        <label for="ejemplo_email_1">Email</label>
        <input type="email" class="form-control" name="email" id="ejemplo_email_1"
               placeholder="Introduce tu email">
    </div>
    <div class="row">
        <button type="submit" class="btn btn-primary col-md-3 col-md-offset-2">Enviar</button>
        <button type="button" class="btn btn-primary col-md-3 col-md-offset-2" onclick="mostrarLogin();">Cancelar</button>
    </row>
    </br>
    </br>
    </br>
</form>
