package es.cursojava.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculadora")
public class CalculadoraServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Default constructor.
	 */
	public CalculadoraServlet() {
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Entrando en doGet de CalculadoraServlet");

		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		String operacion = req.getParameter("operacion");

		int resultado = 0;

		switch (operacion) {
		case "suma":
			resultado = Integer.parseInt(num1) + Integer.parseInt(num2);
			break;
		case "resta":
			resultado = Integer.parseInt(num1) - Integer.parseInt(num2);
			break;
		case "multiplicacion":
			resultado = Integer.parseInt(num1) * Integer.parseInt(num2);
			break;
		case "division":
			resultado = Integer.parseInt(num1) / Integer.parseInt(num2);
			break;
		default:
			resp.getWriter().append(operacion +"Operacion no soportada");
			break;
		}

		resp.getWriter().append("<h1>Resultado: ").append(String.valueOf(resultado)).append("</h1>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		super.doPost(req, resp);
	}

	@Override
	public void init() throws ServletException {
		
		super.init();
	}

	@Override
	public void destroy() {
	
		super.destroy();
	}
	

	

}
