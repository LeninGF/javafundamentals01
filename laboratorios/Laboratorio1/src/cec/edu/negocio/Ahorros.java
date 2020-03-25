package cec.edu.negocio;

public class Ahorros extends Cuenta {

	private String subTipoCuenta;

	public Ahorros(String numeroCuenta, float saldoCuenta, String identificacionPropietario, String subTipoCuenta) {
		// generar en source generate constructor using fields
		// heredo los atributos y metodos publicos y protegidos
		super(numeroCuenta, saldoCuenta, identificacionPropietario); // superb:llama a los tres atributs generales y los
																		// inicializa
		this.subTipoCuenta = subTipoCuenta; // inicializa el atributo propio
	}
	/**
	 * Este metodo maneja el retiro de la cuenta de Ahorros
	 * @param valorRetiro
	 * @return saldo de la cuenta actualizado
	 */
	public float retiroCuenta(float valorRetiro) {
		float temp=saldoCuenta;
		temp = saldoCuenta - valorRetiro;
		if(saldoCuenta>=valorRetiro) {
			saldoCuenta=temp;
		}
		else {
			System.out.println("Fondos insuficientes: $"+String.format("%.2f", temp));
		}
		return temp;
	}
	
	public float retiroCuenta2(float valorRetiro) {
		float temp;
		if(saldoCuenta>=valorRetiro) {
			saldoCuenta-=valorRetiro;
			temp = saldoCuenta;
		}
		else {
			temp = saldoCuenta-valorRetiro;
			System.out.println("Error, fondos insuficientes: $" + String.format("%.2f", temp));
		}
		return temp;
	}

	public String getSubTipoCuenta() {
		return subTipoCuenta;
	}

	public void setSubTipoCuenta(String subTipoCuenta) {
		this.subTipoCuenta = subTipoCuenta;
	}

}
