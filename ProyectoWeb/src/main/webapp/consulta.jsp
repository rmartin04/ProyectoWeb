<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="es.cursojava.web.dto.CalculadoraDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Consulta de datos</h2>

	<table border="1">
		<tr>
			<th>Primer número</th>
			<th>Segundo número</th>
			<th>Operación</th>
			<th>Resultado</th>
			<th>Fecha</th>
		</tr>
		<%
    CalculadoraDTO dto = (CalculadoraDTO) request.getAttribute("datos");
    if (dto != null) {
    	for (CalculadoraDTO dto : lista) {
    	%>
		<tr>
		    <td><%= dto.getNum1() %></td>
		    <td><%= dto.getNum2() %></td>
			<td><%= dto.getOperacion() %></td>
			<td><%= dto.getResultado() %></td>
			<td><%= dto.getFecha() %></td>
		</tr>
	<%
		}%>
</body>
</html>