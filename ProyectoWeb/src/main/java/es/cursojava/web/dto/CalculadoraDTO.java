package es.cursojava.web.dto;

public class CalculadoraDTO {
	
	private int num1;
	private int num2;
	private String operacion;
	private int resultado;
	private String mensaje;
	
	
	
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


	@Override
	public String toString() {
		return "CalculadoraDTO [num1=" + num1 + ", num2=" + num2 + ", resultado=" + resultado + ", mensaje=" + mensaje
				+ "]";
	}
	

	

}
