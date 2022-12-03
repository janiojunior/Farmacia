package br.unitins.topicos1.farmacia.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/teste.php")
public class TesteServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<h1> Exemplo Servlet </h1");	
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");

		//super.doGet(req, resp);
	}

}
