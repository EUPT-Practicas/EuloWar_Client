<%-- 
    Document   : form_login
    Created on : 19-may-2015, 10:34:39
    Author     : Sergio
--%>

                        <!-- Formulario de inicio sesion -->
                        <form id="uno" action="Login" name="nombre" method="POST">
                            <div class=" form-group">
                                <label for="ejemplo_password_1">Usuario</label>
                                <input type="text" class="form-control" placeholder="Nombre de usuario">
                            </div>

                            <div class="form-group">
                                <label for="ejemplo_password_1">Contraseña</label>
                                <input type="password" class="form-control" name="password" id="ejemplo_password_1" 
                                       placeholder="Contraseña">
                            </div>

                            <button type="submit" class="btn btn-primary col-md-8 col-md-offset-2">Enviar</button>
                            </br>
                            </br>

                            <a onClick="mostrarRegistro();">
                                <p class="text-center">Registrate</p>
                            </a>
                            </br>
                        </form>
