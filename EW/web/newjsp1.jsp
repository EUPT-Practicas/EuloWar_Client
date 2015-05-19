<%-- 
    Document   : newjsp1
    Created on : 19-may-2015, 10:33:32
    Author     : Sergio
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

        <script type="text/javascript">

//            function mostrarRegistro() {
//                $.ajax({
//                    type: "POST",
//                    url: "form_registro.jsp",
//                    success: function (msg) {
//                        $('#formularios').empty();
//                        $('#formularios').html(msg);
//                    }
//                });
//            }
//
//            function mostrarLogin() {
//                $.ajax({
//                    type: "POST",
//                    url: "form_login.jsp",
//                    success: function (msg) {
//                        $('#formularios').empty();
//                        $('#formularios').html(msg);
//                    }
//                });
//            }

            function mostrar(numero) {
                document.getElementById(numero).style.display = 'block';
            }
            function ocultar(numero) {
                document.getElementById(numero).style.display = 'none';
            }
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

                <div  class="row">

                    <!--<img src="img/war1.png" class="img-responsive img-thumbnail col-md-4 col-md-offset-4" alt="Responsive image">--></br>
                    <div  class="panel panel-default col-md-4 col-md-offset-4">

                        <!--<h4 class="text-center">Registrado</h4>-->
                        <img src="./img/logotipo.png" class="img-responsive " alt="Logo EuloWar">
                        <div id="seccionErrores" class="row col-md-10 col-md-offset-1">
                            <!--                            <div class="alert alert-danger" role="alert">
                                                            <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                                                            <span class="sr-only">Error:</span>
                                                            Usuario ó contraseña incorectos
                                                        </div>        -->
                        </div>
                        <!-- Formulario de inicio sesion / Registro -->
                        <div id="formularios">
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
                        </div>

                    </div>
                </div>
            </section>



        </div>
        <footer class="container">
            <%@ include file='footer.jsp' %>
        </footer>
        <!-- Librería jQuery requerida por los plugins de JavaScript -->
        <script src="http://code.jquery.com/jquery.js"></script>
        
        <script src="./js/myJavaScript.js"></script>

        <!-- Todos los plugins JavaScript de Bootstrap (también puedes
             incluir archivos JavaScript individuales de los únicos
             plugins que utilices) -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>


