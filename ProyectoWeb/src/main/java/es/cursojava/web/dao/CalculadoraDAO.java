package es.cursojava.web.dao;

import java.util.List;

import es.cursojava.web.entities.CalculadoraEntity;

public interface CalculadoraDAO {
	
	// Operaciones CRUD
	public void insertar(CalculadoraEntity calculadora);

	public void actualizar(CalculadoraEntity calculadora);

	public void eliminar(Long id);

	public CalculadoraEntity obtenerPorId(Long id);

	public List<CalculadoraEntity> obtenerTodos();

	// Operaciones de negocio
	public int suma(int num1, int num2);

	public int resta(int num1, int num2);

	public int multiplicacion(int num1, int num2);

	public int division(int num1, int num2);

}
