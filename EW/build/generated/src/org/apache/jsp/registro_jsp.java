package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>EuloWar</h1>\r\n");
      out.write("        </div>    \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"panel panel-default col-md-3 col-md-offset-2\">\r\n");
      out.write("                <h4 class=\"text-center\">Nuevo usuario</h4>\r\n");
      out.write("                <form role=\"form_alta\" action=\"Alta\" method=\"POST\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"ejemplo_email_1\">Email</label>\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\" name=\"email\" id=\"ejemplo_email_1\"\r\n");
      out.write("                               placeholder=\"Introduce tu email\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"ejemplo_password_1\">Usuario</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"nombreUsuario\" placeholder=\"Nombre de usuario\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"ejemplo_password_1\">Contraseña</label>\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"password\" id=\"ejemplo_password_1\" \r\n");
      out.write("                               placeholder=\"Contraseña\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"ejemplo_password_1\">R. Contraseña</label>\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"passwordRepit\" id=\"ejemplo_password_1\" \r\n");
      out.write("                               placeholder=\"Contraseña\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Enviar</button>\r\n");
      out.write("                    </br></br>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel panel-default col-md-3 col-md-offset-2\">\r\n");
      out.write("                <h4 class=\"text-center\">Usuario registrado</h4>\r\n");
      out.write("                <form role=\"form_registro\"  action=\"Login\" method=\"POST\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"ejemplo_password_1\">Usuario</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"nombre\" placeholder=\"Nombre de usuario\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"ejemplo_password_1\">Contraseña</label>\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"password\" id=\"ejemplo_password_1\" \r\n");
      out.write("                               placeholder=\"Contraseña\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                                        \r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Enviar</button>\r\n");
      out.write("                    </br></br>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Librería jQuery requerida por los plugins de JavaScript -->\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Todos los plugins JavaScript de Bootstrap (también puedes\r\n");
      out.write("             incluir archivos JavaScript individuales de los únicos\r\n");
      out.write("             plugins que utilices) -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
