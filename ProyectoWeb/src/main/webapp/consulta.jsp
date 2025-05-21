<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="es.cursojava.web.dto.CalculadoraDTO" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Consulta de operaciones</title>
  <style>
    body {
      font-family: 'Segoe UI', sans-serif;
      background-color: #f4f6f8;
      margin: 40px;
    }

    h2 {
      text-align: center;
      color: #333;
    }

    table {
      width: 90%;
      margin: 20px auto;
      border-collapse: collapse;
      background-color: #ffffff;
      box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
      border-radius: 8px;
      overflow: hidden;
    }

    th, td {
      padding: 14px 20px;
      text-align: center;
    }

    th {
      background-color: #007acc;
      color: white;
      text-transform: uppercase;
      letter-spacing: 1px;
    }

    tr:nth-child(even) {
      background-color: #f2f2f2;
    }

    tr:hover {
      background-color: #d0ebff;
    }

    p {
      text-align: center;
      color: #555;
    }
  </style>
  </head>
<body>
	<h2>Consulta de operaciones</h2>

	<table  border="6">
		<tr>
			<th>Primer número</th>
			<th>Segundo número</th>
			<th>Operación</th>
			<th>Resultado</th>
			<th>Fecha de insercion</th>
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