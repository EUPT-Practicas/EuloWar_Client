<%-- 
    Document   : index
    Created on : 28-abr-2015, 17:55:08
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>EuloWar</title>
        <link href="css/newcss.css" rel="stylesheet" media="screen">
        <!-- CSS de Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/JavaScript" src="js/websocket.js"></script>
        <script type="text/JavaScript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
        <script type="text/JavaScript" src="js/websocket.js"></script>
        <script type="text/JavaScript">
            $(document).ready(function(){
                $("#mostrar").on( "click", function() {
                    if ($('#target').is(":visible")){
                        $('#target').hide();
                    } else {
                        $('#target').show(100); //muestro mediante id
                    }
                 });
            });
        </script>


        <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="bodyimg">

        <div class="container">

            <section class="row">
                <div row="row">
                    <!--<img src="img/war1.png" class="img-responsive img-thumbnail col-md-4 col-md-offset-4" alt="Responsive image">--></br>
                    <div>
                        <div class="panel panel-default col-md-4 col-md-offset-4" id="panelLogin">
                            <!--<h4 class="text-center">Registrado</h4>-->
                            <img src="./img/logotipo.png" class="img-responsive " alt="Logo EuloWar">

                            <form action="Login" name="nombre" method="POST">
                                <div class="form-group">
                                    <label for="ejemplo_password_1">Usuario</label>
                                    <input type="text" class="form-control" name="nombre" placeholder="Nombre de usuario">
                                </div>

                                <div class="form-group">
                                    <label for="ejemplo_password_1">Contraseña</label>
                                    <input type="password" class="form-control" name="password" id="ejemplo_password_1" 
                                           placeholder="Contraseña">
                                </div>

                                <button type="submit" class="btn btn-primary col-md-8 col-md-offset-2">Acceder</button>
                                </br>
                                </br>

                                <a href="#" id="mostrar" type="button"><p class="text-center">Registrarse</p></a>
                                
                            </form>
                            
                            <!-- REGISTRO -->
                            <div style="display: none" id="target">
                                <h4 class="text-center">Nuevo usuario</h4>
                                <form action="Alta" method="POST">
                                    <div class="form-group">
                                        <label for="ejemplo_email_1">Email</label>
                                        <input type="email" class="form-control" name="email" id="ejemplo_email_1"
                                               placeholder="Introduce tu email">
                                    </div>
                                    <div class="form-group">
                                        <label for="ejemplo_password_1">Usuario</label>
                                        <input type="text" class="form-control" name="nombreUsuario" placeholder="Nombre de usuario">
                                    </div>

                                    <div class="form-group">
                                        <label for="ejemplo_password_1">Contraseña</label>
                                        <input type="password" class="form-control" name="password" id="ejemplo_password_1" 
                                               placeholder="Contraseña">
                                    </div>
                                    <div class="form-group">
                                        <label for="ejemplo_password_1">R. Contraseña</label>
                                        <input type="password" class="form-control" name="passwordRepit" id="ejemplo_password_1" 
                                               placeholder="Contraseña">
                                    </div>

                                    <button type="submit" class="btn btn-primary col-md-8 col-md-offset-2">Registrar</button>
                                    </br>
                                    </br>
                                </form>
                            </div>
                            <!-- FIN DE REGISTRO -->
                            
                        </div>
                    </div>     
                </div>
            </section>
            <div style="display: none" class="row col-md-4 col-md-offset-4">
                <div class="alert alert-danger" role="alert">
                    <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                    <span class="sr-only">Error:</span>
                    Usuario ó contraseña incorectos
                </div>        
            </div>


        </div>
        <footer class="container">
            <%@ include file='footer.jsp' %>
        </footer>
        <!-- Librería jQuery requerida por los plugins de JavaScript -->
        <script src="http://code.jquery.com/jquery.js"></script>

        <!-- Todos los plugins JavaScript de Bootstrap (también puedes
             incluir archivos JavaScript individuales de los únicos
             plugins que utilices) -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
