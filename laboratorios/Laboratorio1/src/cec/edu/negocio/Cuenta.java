package cec.edu.negocio;

public class Cuenta {
	//	Clase Padre
	//  Definiendo atributos (todos los atributos son privados)
	//  Por defecto si un atributo no esta con modificador de acceso se asume private	
	//  Cuando usamos herencia, es necesario cambiar private por protected para heredar los atributos
	protected String numeroCuenta;   // String con Mayus es Clase, asi que hay metodos en numeroCuenta
	protected float saldoCuenta;     // Es variable global
	protected String identificacionPropietario;
	
	// Creando el constructor (inicializa atributos):
	public Cuenta(String numeroCuenta, float saldoCuenta, String identificacionPropietario){
		this.numeroCuenta = numeroCuenta;
		this.saldoCuenta = saldoCuenta;
		this.identificacionPropietario = identificacionPropietario;
	}

	
//	public Cuenta(String numeroCuenta, float saldoCuenta) {
////		super();  // super es de una Clase Objeto que es .class es decir superconstructor de bytecode
//		this.numeroCuenta = numeroCuenta;
//		this.saldoCuenta = saldoCuenta;
//	}




	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;  // accedo al atributo de la clase con this
	}
	
	public float getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(float saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	
	public String getIdentificacionPropietario() {
		return identificacionPropietario;
	}
	public void setIdentificacionPropietario(String identificacionPropietario) {
		this.identificacionPropietario = identificacionPropietario;
	}
	
	
}
