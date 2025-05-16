package es.cursojava.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.web.utils.HibernateUtil;
import es.cursojava.web.entities.Calculadora;

public class CalculadoraDAOImpl implements CalculadoraDAO {

	@Override
	public void insertar(Calculadora calculadora) {
		 Session session = HibernateUtil.getSession();
	        Transaction tx = session.beginTransaction();
	        session.persist(calculadora);
	        tx.commit();
	}

	@Override
	public void actualizar(Calculadora calculadora) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Calculadora obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Calculadora> obtenerTodos() {
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
