<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="es.cursojava.web.dto.CalculadoraDTO"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Calculadora Servlet</title>
 
  <link rel="stylesheet" href="css/estilos_calculadora.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
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

<form action="calculadora" method="get" style="margin-top: 30px; text-align: center;">
  <button type="submit" style="
    background-color: #0288d1;
    color: white;
    border: none;
    padding: 12px 24px;
    border-radius: 6px;
    font-size: 16px;
    cursor: pointer;
    display: inline-flex;
    align-items: center;
    gap: 10px;
    box-shadow: 0 4px 12px rgba(0,0,0,0.1);
    transition: transform 0.2s ease, background 0.3s ease;
  " onmouseover="this.style.transform='scale(1.05)'" onmouseout="this.style.transform='scale(1)'">
    <i class="fas fa-table"></i> Consultar operaciones
  </button>
</form>


</body>
</html>