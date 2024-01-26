package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title>");
		out.println("<html><head><link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">");
		out.println("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Oswald\">\n");
		out.println("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open Sans\">");
		out.println("<style>h1,h2,h3,h4,h5,h6 {font-family: \"Oswald\"}body {font-family: \"Open Sans\"}</style>");
		out.println("</head><body>");
 		out.println("<h1>Bienvenido");
		out.println(request.getParameter("fname") + " " + request.getParameter("lname"));
		out.println("!!</h1>");
		out.println("Esta es nuestra primera actividad");
		out.println("</body></html>");
	}

}