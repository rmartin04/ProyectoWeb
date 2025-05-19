package es.cursojava.web.dto;

import java.util.Calendar;
import java.util.Date;

public class CalculadoraDTO {
	
	private int num1;
	private int num2;
	private String operacion;
	private int resultado;
	private String mensaje;
	private Date fecha;
	
	
	
	public CalculadoraDTO(int num1, int num2, String operacion, int resultado, Date fecha) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operacion = operacion;
		this.resultado = resultado;
		 Calendar cal = Calendar.getInstance();
	        cal.set(Calendar.HOUR_OF_DAY, 0);
	        cal.set(Calendar.MINUTE, 0);
	        cal.set(Calendar.SECOND, 0);
	        cal.set(Calendar.MILLISECOND, 0);
	        this.fecha= cal.getTime();
	}


	public CalculadoraDTO(int num1, int num2, String operacion) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operacion = operacion;
	}


	public CalculadoraDTO(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}


	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}


	public int getResultado() {
		return resultado;
	}


	public void setResultado(int resultado) {
		this.resultado = resultado;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	


	public String getOperacion() {
		return operacion;
	}


	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "CalculadoraDTO [num1=" + num1 + ", num2=" + num2 + ", resultado=" + resultado + ", mensaje=" + mensaje
				+ "]";
	}
	

	

}
