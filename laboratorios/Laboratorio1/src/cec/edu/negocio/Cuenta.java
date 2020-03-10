package cec.edu.negocio;

public class Cuenta {
	//	Clase Padre
	//  Definiendo atributos (todos los atributos son privados)
	//  Por defecto si un atributo no esta con modificador de acceso se asume private	
	private String numeroCuenta;   // String con Mayus es Clase, asi que hay metodos en numeroCuenta
	private float saldoCuenta;     // Es variable global
	private String identificacionPropietario;
	
	// Creando el constructor (inicializa atributos):
	public Cuenta(String numeroCuenta, float saldoCuenta, String identificacionPropietario){
		this.numeroCuenta = numeroCuenta;
		this.saldoCuenta = saldoCuenta;
		this.identificacionPropietario = identificacionPropietario;
	}

	
//	public Cuenta(String numeroCuenta, float saldoCuenta) {
////		super();
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
