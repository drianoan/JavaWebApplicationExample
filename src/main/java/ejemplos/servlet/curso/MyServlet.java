package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title><link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">");
		out.println("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Oswald\">\n");
		out.println("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open Sans\">");
		out.println("<style>h1,h2,h3,h4,h5,h6 {font-family: \"Oswald\"}body {font-family: \"Open Sans\"}</style>");
		out.println("</head><body>");
		out.println("<h1>Actividad 1 Servlet</h1>");
		out.println("<p>Este es un ejemplo en el curso de Java para generar HTML desde un Servlet.</p>");

		out.println("<p>Formulario para enviar información al siguiente servlet</p>");
		out.println("<form action=\"/myServlet2\">");
		out.println("<label for=\"fname\">Nombre:</label><br>");
		out.println("<input type=\"text\" id=\"fname\" name=\"fname\" value=\"Pepe\"><br>");
		out.println("<label for=\"lname\">Apellido:</label><br>");
		out.println("<input type=\"text\" id=\"lname\" name=\"lname\" value=\"Perez\"><br><br>");
		out.println("<input type=\"submit\" value=\"Submit\">");
		out.println("</form> ");

		out.println("</body></html>");
	}

}