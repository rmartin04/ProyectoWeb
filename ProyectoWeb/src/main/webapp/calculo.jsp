<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="es.cursojava.web.dto.CalculadoraDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora Servlet</title>
</head>
<body>
	<form action="calculadora" method="post">
		Introduce el primer número: <br> <input type="text" required
			name="num1" placeholder="Primer número" size="20" maxlength="10"><br>
		<br> Introduce el segundo número: <br> <input type="text"
			required name="num2" placeholder="Segundo número" size="20"
			maxlength="10"><br> <br> Lista de operaciones: <br>
		<select name="operacion" required>
			<option value="opcion0" selected>Seleccione una operación</option>
			<option value="suma">Suma</option>
			<option value="resta">Resta</option>
			<option value="multiplicacion">Multiplicación</option>
			<option value="division">División</option>
		</select> <br> <br>
		<%
		if (request.getParameter("mensaje") != null) {
			String mensaje = request.getParameter("mensaje");
		%>


		<h2><%=mensaje%></h2>

		<%
		}
		%>


		<%
		CalculadoraDTO dto2 = (CalculadoraDTO) request.getAttribute("dto");
		if (dto2 != null) {
		%>
		<p>Tengo el dto!!!</p>
		<%} %>



		<br> <br>
		
		<button type="reset">Resetear</button>
		<button type="submit">Enviar</button>
	</form>
	<br> <br>
		<a href="calculadora" >consultar operaciones</a>

</body>
</html>