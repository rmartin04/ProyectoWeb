package es.cursojava.web.services;

import es.cursojava.web.dto.CalculadoraDTO;

public class CalculadoraService {

	public void ejecutaOperacion(CalculadoraDTO dto) {
		

		String operacion = dto.getOperacion();
		int num1 = dto.getNum1();
		int num2 = dto.getNum2();
		int resultado = 0;
		switch (operacion) {
		case "suma":
			resultado = num1 + num2;
			break;
		case "resta":
			resultado = num1 - num2;
			break;
		case "multiplicacion":
			resultado = num1 * num2;
			break;
		case "division":
			resultado = num1 / num2;
			break;
		default:
			dto.setMensaje(operacion + "Operacion no soportada");
			break;
		}
		dto.setMensaje("El resultado de la operacion es: " + resultado);
		dto.setResultado(resultado);

	}

}
