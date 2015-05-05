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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Plantilla básica de Bootstrap</title>\n");
      out.write("\n");
      out.write("        <!-- CSS de Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\n");
      out.write("        <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>EuloWar</h1>\n");
      out.write("        </div>    \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <a href=\"registro.jsp\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary col-md-2 col-md-offset-8\">Identificate</button>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        </br>\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"row \">\n");
      out.write("            <img src=\"img/war.png\" class=\"img-responsive  col-md-4 col-md-offset-4\" alt=\"Responsive image\">\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <p class=\"col-md-6 col-md-offset-3 panel panel-default\">\n");
      out.write("            Defien y ataca para ser el Nº1 </br>\n");
      out.write("            Administra turs recursos ó . </br>\n");
      out.write("            Construlle defensas para evadir ataques enemigos ó  ataca para robar recursos y hacerte mas fuerte.\n");
      out.write("           \n");
      out.write("        </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4\">.col-md-4</div>\n");
      out.write("            <div class=\"col-md-4 col-md-offset-4\">.col-md-4 .col-md-offset-4</div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 col-md-offset-3\">.col-md-3 .col-md-offset-3</div>\n");
      out.write("            <div class=\"col-md-3 col-md-offset-3\">.col-md-3 .col-md-offset-3</div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 col-md-offset-3\">.col-md-6 .col-md-offset-3</div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Librería jQuery requerida por los plugins de JavaScript -->\n");
      out.write("        <script src=\"http://code.jquery.com/jquery.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Todos los plugins JavaScript de Bootstrap (también puedes\n");
      out.write("             incluir archivos JavaScript individuales de los únicos\n");
      out.write("             plugins que utilices) -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
