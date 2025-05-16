package es.cursojava.web.dao;

import java.util.List;

import es.cursojava.web.entities.CalculadoraEntity;

public class CalculadoraDAOImpl implements CalculadoraDAO {

	@Override
	public void insertar(CalculadoraEntity calculadora) {
		
	}

	@Override
	public void actualizar(CalculadoraEntity calculadora) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public CalculadoraEntity obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CalculadoraEntity> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int suma(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int resta(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiplicacion(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int division(int num1, int num2) {
		if (num2 == 0) {
			throw new ArithmeticException("Division por cero no permitida");
		}

		return num1 / num2;

	}

}
