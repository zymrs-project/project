package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=utf-8");
      response.addHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<!--this scripts are used for the calander \r\n");
      out.write(" -->\r\n");
      out.write("  \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>ZYMRS</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.css\" media=\"screen\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/standard.css\" media=\"screen\"/>\r\n");
      out.write("\r\n");
      out.write("<!--this scripts are used for the slider div  -->\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"http://athena.fhict.nl/users/i270018/ZYMRS/slide/js-image-slider.css\"  />\r\n");
      out.write(" <script src=\"http://athena.fhict.nl/users/i270018/ZYMRS/slide/js-image-slider.js\" type=\"text/javascript\"></script>\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"http://athena.fhict.nl/users/i270018/ZYMRS/slide/generic.css\"  />\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t\t\r\n");
      out.write("        <header>\r\n");
      out.write("        <div id=\"banner\">\r\n");
      out.write("\t\t <div id=\"bannerinfo\">\r\n");
      out.write("\t\t <a href=\"register.jsp\">Register</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("         \r\n");
      out.write("        <form action=\"index.jsp\">\r\n");
      out.write("    \t\t\t<input type=\"text\" value=\"user-id\">\r\n");
      out.write("                <input type=\"password\" value=\"password\">\r\n");
      out.write("                <input type=\"submit\" value=\"Login\">\r\n");
      out.write("                \r\n");
      out.write("    \t</form>\r\n");
      out.write("        \r\n");
      out.write("         <div class=\"clear\"></div>\r\n");
      out.write("\t    </header>\r\n");
      out.write("    \t<nav>\r\n");
      out.write("    \t\t<ul>\r\n");
      out.write("    \t\t  <li><a href=\"index.jsp\">Home</a>\r\n");
      out.write("    \t\t\t<li><a href=\"index.jsp\">Flights</a>\r\n");
      out.write("    \t\t\t<li><a href=\"index.jsp\">Hotels</a>\r\n");
      out.write("    \t\t\t<li><a href=\"index.jsp\">Cars</a>\r\n");
      out.write("    \t\t\t<li><a href=\"index.jsp\">about Us</a>\r\n");
      out.write("    \t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("        </header>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://athena.fhict.nl/users/i270018/ZYMRS/css/style.css\" media=\"screen\" />\r\n");
      out.write("  <section class=\"page\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"searchinput\">\r\n");
      out.write("   <form class=\"form\">\r\n");
      out.write("   <input type=\"radio\" name=\"searchoption\" value=\"flight\" checked=\"checked\">Flight\r\n");
      out.write("   <input type=\"radio\" name=\"searchoption\" value=\"hotel\">Hotel\r\n");
      out.write("   <input type=\"radio\" name=\"searchoption\" value=\"flightandhotel\">Flight and Hotel\r\n");
      out.write("   <input type=\"radio\" name=\"searchoption\" value=\"all\">Flight, Hotel and Car<br></br>\r\n");
      out.write("   \r\n");
      out.write("   From: <input type=\"text\" name=\"origin\">\r\n");
      out.write("   To: <input type=\"text\" name=\"destination\"><br></br>\r\n");
      out.write("   \r\n");
      out.write("   <input type=\"radio\" name=\"class\" value=\"bussiness\">Bussiness\r\n");
      out.write("   <input type=\"radio\" name=\"class\" value=\"economic\" checked=\"checked\">Economic<br></br>\r\n");
      out.write("   \r\n");
      out.write("   <input type=\"radio\" name=\"one-way\" value=\"one-way\">Round\r\n");
      out.write("   <input type=\"radio\" name=\"round\" value=\"round\" checked=\"checked\">One-Way<br></br>\r\n");
      out.write("   \r\n");
      out.write("   Leave: <input type=\"date\"  name=\"depart\"><br></br>\r\n");
      out.write("   \r\n");
      out.write("   Return: <input type=\"date\" name=\"arrive\"><br></br>\r\n");
      out.write("   \r\n");
      out.write("  <label for=\"passenger\">Adult</label>\r\n");
      out.write("  <select name=\"adult\">\r\n");
      out.write("  <option value=\"1\" selected>1</option>\r\n");
      out.write("  <option value=\"2\">2</option>\r\n");
      out.write("  <option value=\"3\">3</option>\r\n");
      out.write("  </select>\r\n");
      out.write("  \r\n");
      out.write("  <label for=\"passenegrs\">Children</label>\r\n");
      out.write("  <select name=\"children\">\r\n");
      out.write("  <option value=\"0\" selected>0</option>\r\n");
      out.write("  <option value=\"1\">1</option>\r\n");
      out.write("  <option value=\"2\">2</option>\r\n");
      out.write("  <option value=\"3\">3</option>\r\n");
      out.write("  <option value=\"4\">4</option>\r\n");
      out.write("  <option value=\"5\">5</option>\r\n");
      out.write("  <option value=\"6\">6</option>\r\n");
      out.write("  </select></br></br>\r\n");
      out.write("  \r\n");
      out.write("  <input class=\"btn\" type=\"submit\" value=\"SEARCH\" style=\"float:right\"><br></br>\r\n");
      out.write("  \r\n");
      out.write("  </form>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"homeinnerpage\">\r\n");
      out.write("  \r\n");
      out.write("  <p>The agency brings you the cheapest flights, and hotels to the top destinations</p>\r\n");
      out.write("  <p>We work with more than 500 partners to achive our goal of delivering the best and cheapest service</p>\r\n");
      out.write("  <h3><a href=\"\" >Top Destinations</a></h3>\r\n");
      out.write("  <h3><a href=\"\" >Cheap Destinations</a></h3>\r\n");
      out.write("  <h3><a href=\"\" >New Destinations</a></h3>\r\n");
      out.write("  <p>Join us @</p> \r\n");
      out.write("  <h3><a href=\"\" >Facebook</a></h3>\r\n");
      out.write("  <h3><a href=\"\" >Twitter</a></h3>\r\n");
      out.write("  \r\n");
      out.write("   <div id=\"grouppicture\">\r\n");
      out.write("   <img src=\"images/group.jpg\" style= \"width:180px; height:180px\">\r\n");
      out.write("   </div>\r\n");
      out.write("  \r\n");
      out.write("  </div> \r\n");
      out.write("  <div class=\"commercialpage\">\r\n");
      out.write("  \r\n");
      out.write(" <div id=\"sliderFrame\">\r\n");
      out.write("        <div id=\"slider\">\r\n");
      out.write("            <a href=\"\"><img src=\"http://athena.fhict.nl/users/i270018/ZYMRS/images/turkey.jpg\" /></a>\r\n");
      out.write("           <a href=\"\"> <img src=\"http://athena.fhict.nl/users/i270018/ZYMRS/images/slide1.jpg\" /></a>\r\n");
      out.write("            <a href=\"\"><img src=\"http://athena.fhict.nl/users/i270018/ZYMRS/images/slide2.jpg\" /></a>\r\n");
      out.write("            <a href=\"\"><img src=\"http://athena.fhict.nl/users/i270018/ZYMRS/images/slide3.jpg\" /></a>\r\n");
      out.write("            <a href=\"\"><img src=\"http://athena.fhict.nl/users/i270018/ZYMRS/images/slide4.jpg\" /></a>\r\n");
      out.write("           <a href=\"\"> <img src=\"http://athena.fhict.nl/users/i270018/ZYMRS/images/slide5.jpg\" /></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--Custom navigation buttons on both sides-->\r\n");
      out.write("        <div class=\"group1-Wrapper\">\r\n");
      out.write("            <a onClick=\"imageSlider.previous()\" class=\"group1-Prev\"></a>\r\n");
      out.write("            <a onClick=\"imageSlider.next()\" class=\"group1-Next\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--nav bar-->\r\n");
      out.write("        <div style=\"text-align:center;padding:20px;z-index:20;\">\r\n");
      out.write("            <a onClick=\"imageSlider.previous()\" class=\"group2-Prev\"></a>\r\n");
      out.write("            <a id='auto' onClick=\"switchAutoAdvance()\"></a>\r\n");
      out.write("            <a onClick=\"imageSlider.next()\" class=\"group2-Next\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  </div>   \r\n");
      out.write("          \r\n");
      out.write(" </section>\r\n");
      out.write(" \r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("        //The following script is for the group 2 navigation buttons.\r\n");
      out.write("        function switchAutoAdvance() {\r\n");
      out.write("            imageSlider.switchAuto();\r\n");
      out.write("            switchPlayPauseClass();\r\n");
      out.write("        }\r\n");
      out.write("        function switchPlayPauseClass() {\r\n");
      out.write("            var auto = document.getElementById('auto');\r\n");
      out.write("            var isAutoPlay = imageSlider.getAuto();\r\n");
      out.write("            auto.className = isAutoPlay ? \"group2-Pause\" : \"group2-Play\";\r\n");
      out.write("            auto.title = isAutoPlay ? \"Pause\" : \"Play\";\r\n");
      out.write("        }\r\n");
      out.write("        switchPlayPauseClass();\r\n");
      out.write("    </script>\r\n");
      out.write("              \r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"js/discover.js\"></script>\r\n");
      out.write("    <script src=\"js/lightbox.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-1.8.1.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"js/jquery.backstretch.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("      $.backstretch(\r\n");
      out.write("        [\r\n");
      out.write("          \"http://athena.fhict.nl/users/i270018/ZYMRS/images/airline6.jpg\",\r\n");
      out.write("\t\t  \"http://athena.fhict.nl/users/i270018/ZYMRS/images/hotel3.jpg\",\r\n");
      out.write("          \"http://athena.fhict.nl/users/i270018/ZYMRS/images/airline5.jpg\",\r\n");
      out.write("\t\t  \"http://athena.fhict.nl/users/i270018/ZYMRS/images/hotel1.jpg\",\r\n");
      out.write("\t\t  \"http://athena.fhict.nl/users/i270018/ZYMRS/images/airline4.jpeg\",\r\n");
      out.write("\t\t  \"http://athena.fhict.nl/users/i270018/ZYMRS/images/hotel2.jpg\"\r\n");
      out.write("\t\t \r\n");
      out.write("        ],\r\n");
      out.write("        {duration: 30000}\r\n");
      out.write("      );\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("      $('.carousel').carousel({\r\n");
      out.write("        interval: 20000\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("<footer>\r\n");
      out.write("<div class=\"members\">\r\n");
      out.write("<a href=\"\">Melese</a>\r\n");
      out.write("<a href=\"\">Renuka</a>\r\n");
      out.write("<a href=\"\">Yao</a>\r\n");
      out.write("<a href=\"\">Zhiwei</a>\r\n");
      out.write("<a href=\"\">Yuchen</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("  <p> Copyright &copy; 2014, ZYMRS</p>\r\n");
      out.write("  \r\n");
      out.write("</footer>\r\n");
      out.write("  </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
