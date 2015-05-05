<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Plantilla básica de Bootstrap</title>

        <!-- CSS de Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">

        <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div class="row">
            <h1 class="col-md-2 col-md-offset-1">EuloWar</h1>
            <div class="col-md-2 col-md-offset-7">
                </br>
                <h5 class="text-primary"><strong>Hierro: 5.000</strong></h5>
                <h5 class="text-primary"><strong>Tropas:170/200</strong></h5>
            </div>
        </div> 
        <div class="row">
            <nav class="navbar navbar-inverse panel-default col-md-10 col-md-offset-1">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <!--<a class="navbar-brand" href="#">Project name</a>-->
                    </div>
                    <div id="navbar" class="collapse navbar-collapse">
                        <ul class="nav navbar-nav">
                            <!--<li class="active"><a href="general.jsp">Vision general</a></li>-->
                            <li><a href="minas.jsp">Vision general</a></li>
                            <li><a href="minas.jsp">Minas</a></li>
                            <li><a href="defensa.jsp">Defensa</a></li>
                            <li><a href="#about">Ataque</a></li>
                            <li><a href="#contact">Campamento</a></li>
                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </nav>
        </div>
        
        <div class="row">
            <div class="panel panel-default col-md-10 col-md-offset-1">
                <h4 class="text-center bg-primary">Bienvenido: MR.X</h4>
                </br>  
                </br>  
            </div>
            <div class="panel panel-default col-md-10 col-md-offset-1">
                <h4 class="text-center bg-primary">Registro de actividad</h4>
               </br>
               <div class="row">
                    <img src="img/mano.png" class="img-responsive img-thumbnail col-md-2 col-md-offset-1" alt="Responsive image">
                    <img src="img/mano.png" class="img-responsive img-thumbnail col-md-2 col-md-offset-1" alt="Responsive image">
                    <img src="img/mano.png" class="img-responsive img-thumbnail col-md-2 col-md-offset-1" alt="Responsive image">
                    <img src="img/mano.png" class="img-responsive img-thumbnail col-md-2 col-md-offset-1" alt="Responsive image">
               </br>
               </div>     
            </div>
                
        </div>


        <!-- Librería jQuery requerida por los plugins de JavaScript -->
        <script src="http://code.jquery.com/jquery.js"></script>

        <!-- Todos los plugins JavaScript de Bootstrap (también puedes
             incluir archivos JavaScript individuales de los únicos
             plugins que utilices) -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
