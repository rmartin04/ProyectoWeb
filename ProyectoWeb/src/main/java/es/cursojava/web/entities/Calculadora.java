package es.cursojava.web.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CALCULADORA")
public class Calculadora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="numero1" , nullable = false)
	private int num1;
	@Column(name="numero2" , nullable = false)
	private int num2;
	@Column(name="operacion" , nullable = false)
	private String operacion;
	@Column(name="resultado" , nullable = false)
	private int resultado;
	@Column(name="mensaje")
	private String mensaje;
	
	public Calculadora() {
		
	}

	public Calculadora(int num1, int num2, String operacion) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operacion = operacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
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

	@Override
	public String toString() {
		return "CalculadoraEntity [id=" + id + ", num1=" + num1 + ", num2=" + num2 + ", operacion=" + operacion
				+ ", resultado=" + resultado + ", mensaje=" + mensaje + "]";
	}
	
	
	

}
