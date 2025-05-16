package es.cursojava.web.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import es.cursojava.web.dto.CalculadoraDTO;
import es.cursojava.web.services.CalculadoraService;
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

		String numero1 = req.getParameter("num1");
		String numero2 = req.getParameter("num2");
		String operacion = req.getParameter("operacion");
		
		 int num1 = Integer.parseInt(numero1);
		 int num2 = Integer.parseInt(numero2);
		
		CalculadoraDTO dto = new CalculadoraDTO(num1,num2,operacion);
		CalculadoraService service = new CalculadoraService();
		service.ejecutaOperacion(dto);
		
		System.out.println("Resultado: " + dto.getResultado());
		
		// Enviar el resultado al JSP
		
		req.setAttribute("dto", dto);
		CalculadoraDTO dto2 = (CalculadoraDTO) req.getAttribute("dto");
		
		resp.sendRedirect("calculo.jsp?mensaje=" + dto.getMensaje());
		
//		int resultado = 0;
//
//		switch (operacion) {
//		case "suma":
//			resultado = num1+num2;
//			break;
//		case "resta":
//			resultado = num1-num2;
//			break;
//		case "multiplicacion":
//			resultado = num1*num2;
//			break;
//		case "division":
//			resultado = num1/num2;
//			break;
//		default:
//			resp.getWriter().append(operacion +"Operacion no soportada");
//			break;
//		}
		//resp.sendRedirect("calculo.html");
		//resp.getWriter().append("<h1>Resultado: ").append(String.valueOf(resultado)).append("</h1>");
//		//resp.sendRedirect("calculo.jsp?resultado=" + resultado);
//		
//	    List<String>nombres = new ArrayList<String>();
//	    nombres.add("Juan");
//	    nombres.add("Pedro");
//	    nombres.add("Luis");
//	    nombres.add("Ana");
//	    // Pasar la lista al JSP mediante el request
//        req.setAttribute("nombres", nombres);

        // Redirigir al JSP
       // req.getRequestDispatcher("calculo.jsp?resultado=" + resultado).forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		doPost(req, resp);
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
