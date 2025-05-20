package es.cursojava.web.services;

import java.util.ArrayList;
import java.util.List;

import java.util.Date;
import es.cursojava.web.dao.CalculadoraDAO;
import es.cursojava.web.dao.CalculadoraDAOImpl;
import es.cursojava.web.dto.CalculadoraDTO;
import es.cursojava.web.entities.Calculadora;

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

	public void insertarCalculadora(CalculadoraDTO dto) {
		
		// Aquí se llamaría al DAO para insertar el resultado en la base de datos
         CalculadoraDAO dao = new CalculadoraDAOImpl();
         Calculadora calculadora = new Calculadora(dto.getNum1(), dto.getNum2(), dto.getOperacion(), dto.getResultado(),dto.getFecha());
         dao.insertar(calculadora);
        System.out.println("Insertando en la base de datos: " + dto);
        // Simulación de inserción
        dto.setMensaje("Resultado de la "+dto.getOperacion()+" : "+dto.getResultado()+"\n\tInsertado en la base de datos");
        System.out.println(dto.getMensaje());
        
    }
	private List<CalculadoraDTO> generaDTO(List<Calculadora> calculos) {
		List<CalculadoraDTO> dtos = new ArrayList<>();
		for (Calculadora c : calculos) {
			dtos.add(new CalculadoraDTO( 
					c.getNum1(), 
					c.getNum2(), 
					c.getOperacion(), 
					c.getResultado(),
					c.getFecha()));
		}
		return dtos;
	}

	public List<CalculadoraDTO> obtenerTodos() {
		CalculadoraDAO dao = new CalculadoraDAOImpl();
		List<Calculadora> calculos = dao.obtenerTodos();
		return generaDTO(calculos);
	}

	}


