package cec.edu.negocio;

public class Cuenta {
	//	Clase Padre
	//  Definiendo atributos (todos los atributos son privados)
	//  Por defecto si un atributo no esta con modificador de acceso se asume private	
	private String numeroCuenta;   // String con Mayus es Clase, asi que hay metodos en numeroCuenta
	private float saldoCuenta;     // Es variable global
	private String identificacionPropietario;
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
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
