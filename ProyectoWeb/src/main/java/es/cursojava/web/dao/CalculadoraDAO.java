package es.cursojava.web.dao;

import java.util.List;

import es.cursojava.web.entities.Calculadora;

public interface CalculadoraDAO {
	
	// Operaciones CRUD
	public void insertar(Calculadora calculadora);

	public void actualizar(Calculadora calculadora);

	public void eliminar(Long id);

	public Calculadora obtenerPorId(Long id);

	public List<Calculadora> obtenerTodos();

	// Operaciones de negocio
	public int suma(int num1, int num2);

	public int resta(int num1, int num2);

	public int multiplicacion(int num1, int num2);

	public int division(int num1, int num2);

}
