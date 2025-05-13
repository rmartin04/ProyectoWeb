package es.cursojava.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlumnoServlet
 */
@WebServlet("/alumno")
public class AlumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AlumnoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Entrando en doGet de AlumnoServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//doGet(request, response);
		System.out.println("Entrando en doPost de AlumnoServlet");
	}

	@Override
	public void init() throws ServletException {
	
		//super.init();
		System.out.println("Entrando en init de AlumnoServlet");
	}

	@Override
	public void destroy() {
		
		//super.destroy();
		System.out.println("Destruyendo AlumnoServlet");
	}
	
	

}
