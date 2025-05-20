<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="es.cursojava.web.dto.CalculadoraDTO" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consulta de operaciones</title>
</head>
<body>
	<h2>Consulta de operaciones</h2>

	<table action="calculadora" border="6">
		<tr>
			<th>Primer número</th>
			<th>Segundo número</th>
			<th>Operación</th>
			<th>Resultado</th>
			<th>Fecha</th>
		</tr>
		<%
    List<CalculadoraDTO> dto = (List<CalculadoraDTO>) request.getAttribute("datos");
    if (dto != null) {
    	for (CalculadoraDTO datos : dto) {
    	%>
		<tr>
		    <td><%= datos.getNum1() %></td>
		    <td><%= datos.getNum2() %></td>
			<td><%= datos.getOperacion() %></td>
			<td><%= datos.getResultado() %></td>
			<td><%= datos.getFecha() %></td>
		</tr>
		<%
    	}
    } else {
    	%>
    	
    	<p>No hay datos para mostrar.</p>
    	
    <%
    }
    %>	
   </table>	
	
</body>
</html>