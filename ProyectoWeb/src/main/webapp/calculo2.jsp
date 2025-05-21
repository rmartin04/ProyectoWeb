<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="es.cursojava.web.dto.CalculadoraDTO"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Calculadora Servlet</title>
  <style>
    body {
      font-family: 'Segoe UI', sans-serif;
      background: linear-gradient(to right, #e0f7fa, #fce4ec);
      margin: 0;
      padding: 40px;
      display: flex;
      flex-direction: column;
      align-items: center;
    }

    form {
      background-color: white;
      padding: 30px;
      border-radius: 12px;
      box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
      width: 100%;
      max-width: 400px;
    }

    h2 {
      color: #00796b;
      text-align: center;
    }

    label, select, input {
      display: block;
      width: 100%;
      margin-top: 15px;
      font-size: 16px;
    }

    input, select {
      padding: 10px;
      border-radius: 6px;
      border: 1px solid #ccc;
      box-sizing: border-box;
    }

    button {
      width: 48%;
      padding: 12px;
      margin-top: 20px;
      border: none;
      border-radius: 6px;
      background-color: #00796b;
      color: white;
      font-size: 16px;
      cursor: pointer;
      transition: background 0.3s ease;
    }

    button:hover {
      background-color: #004d40;
    }

    .btn-group {
      display: flex;
      justify-content: space-between;
    }

    a {
      margin-top: 20px;
      display: inline-block;
      text-decoration: none;
      color: #007acc;
    }

    a:hover {
      text-decoration: underline;
    }

    p {
      color: green;
      font-weight: bold;
    }
  </style>
</head>
<body>

  <form action="calculadora" method="post">
    <label for="num1">Introduce el primer número:</label>
    <input type="text" required name="num1" placeholder="Primer número" maxlength="10">

    <label for="num2">Introduce el segundo número:</label>
    <input type="text" required name="num2" placeholder="Segundo número" maxlength="10">

    <label for="operacion">Lista de operaciones:</label>
    <select name="operacion" required>
      <option value="opcion0" selected>Seleccione una operación</option>
      <option value="suma">Suma</option>
      <option value="resta">Resta</option>
      <option value="multiplicacion">Multiplicación</option>
      <option value="division">División</option>
    </select>

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
    <% } %>

    <div class="btn-group">
      <button type="reset">Resetear</button>
      <button type="submit">Enviar</button>
    </div>
  </form>

  <a href="calculadora">Consultar operaciones</a>

</body>
</html>