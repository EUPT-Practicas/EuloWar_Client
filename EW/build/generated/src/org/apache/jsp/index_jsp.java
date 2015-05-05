package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Plantilla básica de Bootstrap</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- CSS de Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("        <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"label label-success\">\r\n");
      out.write("        <div class=\"container label label-warning\">\r\n");
      out.write("            <header>\r\n");
      out.write("                <h1>Mi sitio web</h1>\r\n");
      out.write("                <p>Mi sitio web creado en html5</p>\r\n");
      out.write("            </header>\r\n");
      out.write("            <section>\r\n");
      out.write("            <article>\r\n");
      out.write("                 <h2>Titilo de contenido<h2>\r\n");
      out.write("                <p> Contenido (ademas de imagenes, citas, videos etc.) </p>\r\n");
      out.write("            </article>\r\n");
      out.write("            </section>\r\n");
      out.write("                <aside>\r\n");
      out.write("                <h3>Titulo de contenido</h3>\r\n");
      out.write("                <p>contenido</p>\r\n");
      out.write("                </aside>\r\n");
      out.write("            <footer>\r\n");
      out.write("                Creado por mi el 2011\r\n");
      out.write("            </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("                        <!--        <div class=\"container \">\r\n");
      out.write("                                <div class=\"container label label-danger\">\r\n");
      out.write("                                    <h1>EuloWar</h1>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <a href=\"registro.jsp\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-primary col-md-2 col-md-offset-8\">Identificate</button>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                    <div></div>\r\n");
      out.write("                                \r\n");
      out.write("                                </br>\r\n");
      out.write("                                <div class=\"panel panel-default\">\r\n");
      out.write("                                <div class=\"row \">\r\n");
      out.write("                                    <img src=\"img/war.png\" class=\"img-responsive  col-md-4 col-md-offset-4\" alt=\"Responsive image\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <p class=\"col-md-6 col-md-offset-3 panel panel-default\">\r\n");
      out.write("                                    Defien y ataca para ser el Nº1 </br>\r\n");
      out.write("                                    Administra turs recursos ó . </br>\r\n");
      out.write("                                    Construlle defensas para evadir ataques enemigos ó  ataca para robar recursos y hacerte mas fuerte.\r\n");
      out.write("                                   \r\n");
      out.write("                                </p>\r\n");
      out.write("                                </div>-->\r\n");
      out.write("                        <!--        <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-4\">.col-md-4</div>\r\n");
      out.write("                                    <div class=\"col-md-4 col-md-offset-4\">.col-md-4 .col-md-offset-4</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        \r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-3 col-md-offset-3\">.col-md-3 .col-md-offset-3</div>\r\n");
      out.write("                                    <div class=\"col-md-3 col-md-offset-3\">.col-md-3 .col-md-offset-3</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        \r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-6 col-md-offset-3\">.col-md-6 .col-md-offset-3</div>\r\n");
      out.write("                                </div>-->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Librería jQuery requerida por los plugins de JavaScript -->\r\n");
      out.write("                        <script src=\"http://code.jquery.com/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Todos los plugins JavaScript de Bootstrap (también puedes\r\n");
      out.write("                             incluir archivos JavaScript individuales de los únicos\r\n");
      out.write("                             plugins que utilices) -->\r\n");
      out.write("                        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("                        </body>\r\n");
      out.write("                        </html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
