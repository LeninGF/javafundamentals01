package cec.edu.negocio;

public class Ahorros extends Cuenta {

	private String subTipoCuenta;
	
	public Ahorros(String numeroCuenta, float saldoCuenta, String identificacionPropietario, String subTipoCuenta) {
		// generar en source generate constructor using fields
		// heredo los atributos y metodos publicos y protegidos 
		super(numeroCuenta, saldoCuenta, identificacionPropietario); // superb:llama a los tres atributs generales y los inicializa
		this.subTipoCuenta = subTipoCuenta;                          // inicializa el atributo propio
    }
	
	

	public String getSubTipoCuenta() {
		return subTipoCuenta;
	}

	public void setSubTipoCuenta(String subTipoCuenta) {
		this.subTipoCuenta = subTipoCuenta;
	}
	
}
