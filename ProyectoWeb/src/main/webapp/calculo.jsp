<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora Servlet</title>
</head>
<body>
	<form action="calculadora" method="get">
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
		if (request.getParameter("resultado") != null) {
			int resultado = Integer.parseInt(request.getParameter("resultado"));
		%>
		<h2>
			Resultado:
			<%=resultado%></h2>

		<%
		}
		%>

		
		<h2>Lista de Nombres</h2>
		<ul>
			
			<c:foreach var="nombre" items="${nombres}">
		
			<li>${nombres}</li>
			
			</c:foreach>
	    </ul> 
          


			<br>
			<br>
			<button type="reset">Resetear</button>
			<button type="submit">Enviar</button>
	</form>

</body>
</html>