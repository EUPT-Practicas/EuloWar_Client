<%-- 
    Document   : minas
    Created on : 28-abr-2015, 20:13:34
    Author     : Ricardo
--%>

<%@page import="operacionesminas_client.Mina"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collection"%>
<%@page import="cliente_webservice.ClienteRecursosMinas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <%@ include file='head.jsp' %>
    </head>
    <body>
        <header>    
            <%@ include file='header.jsp' %>
        </header>
        <nav>
            <%@ include file='nav.jsp' %>
        </nav>
        <div class="row">
            <div class="panel panel-default col-md-10 col-md-offset-1">
                <div class="col-md-1 col-md-offset-11 text-right">
                    <h5><strong>Nivel: 5</strong></h5>
                </div> 
                <div class="col-md-5 col-md-offset-0">
                    <img src="img/minas/hierro1.png" class="img-responsive " alt="Responsive image">
                </div>
                <div class="row">

                    <div class="col-md-5 col-md-offset-0">
                        <div clas="row">
                            <h1 class="">Mina de hierro</h1>
                        </div>
                        <div clas="row">
                            <h5 class="">Descripción: Aqui una breve descripción de cual es us función el juego</h5>
                            </br>
                        </div>
                        <div clas="row">
                            <h5 class="">Mejora de defensa: +100</h5>
                        </div>
                        <div clas="row">
                            <h5 class="">Tiempo de mejora: 30 min</h5>
                        </div>
                        <div clas="row">
                            <h5 class="">Coste de mejora: 5.000 Hierro</h5>
                        </div>
                    </div>
                    <!--<div class="col-md-1 col-md-offset-0 text-right">
                        <h5 class="">Nivel: 5</h5>

                        <button type="button" class="btn btn-link">Mejorar</button>
                    </div> -->
                </div> 

                <div class="row col-md-2  col-md-offset-10 ">
                    <a href="">
                        <button type="button" class="btn btn-primary col-md-12 ">Mejorar</button>
                    </a> 
                    </br>   
                    </br>   
                    </br>   

                </div>
                </br>   
            </div>
            <div class="panel panel-default col-md-10 col-md-offset-1">
                </br></br>
                <!--<div class="col-md-1 col-md-offset-0"></div>-->
                <% 
                
                ClienteRecursosMinas minas = new ClienteRecursosMinas();
                List coleccionMinas = minas.obtenerMinas(usuario.getEmail());
                Iterator<Mina> i = coleccionMinas.iterator();
                
                while(i.hasNext()){ 
                    Mina mina = i.next();
                    int nivel = mina.getNivelMina();
                %>
                <div class="col-md-2 col-md-offset-0">
                    <img src="img/minas/hierro1.png" class="img-responsive" alt="Responsive image">
                    <h5 class="text-center">Nivel:<%= nivel %> </h5>
                </div>
                <% }%>
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