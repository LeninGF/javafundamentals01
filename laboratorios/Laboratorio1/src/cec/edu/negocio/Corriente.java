package cec.edu.negocio;

public class Corriente extends Cuenta {
	private float valorSobregiro;
	
	public Corriente(String numeroCuenta, float saldoCuenta, String identificacionPropietario, float valorSobregiro) {
		super(numeroCuenta, saldoCuenta, identificacionPropietario);
		this.valorSobregiro = valorSobregiro;
	}

	public float getValorSobregiro() {
		return valorSobregiro;
	}

	public void setValorSobregiro(float valorSobregiro) {
		this.valorSobregiro = valorSobregiro;
	}
	
	
}
