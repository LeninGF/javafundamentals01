package cec.edu.negocio;

public class CargaMasiva {

	public Ahorros[] cargarAhorro(Ahorros[] arregloAhorros) {

		int numeroCuenta = 0;
		float saldoCuenta = 0;
		for (int i = 0; i < 100; i++) {
			numeroCuenta = (int) (Math.random() * 100000000 + 1);
			saldoCuenta = Float.parseFloat(String.format("%.2f", Math.random() * 10000 + 1).replace(",", "."));
			Ahorros ahorros = new Ahorros(String.valueOf(numeroCuenta), saldoCuenta, "00000000", "CA");
			arregloAhorros[i] = ahorros;
		}
		return arregloAhorros;
	}

	public Corriente[] cargarCorriente(Corriente[] arregloCorriente) {

		int numeroCuenta = 0;
		float saldoCuenta = 0;
		for (int i = 0; i < 100; i++) {
			numeroCuenta = (int) (Math.random() * 100000000 + 1);
			saldoCuenta = Float.parseFloat(String.format("%.2f", Math.random() * 10000 + 1).replace(",", "."));
			Corriente corriente = new Corriente(String.valueOf(numeroCuenta), saldoCuenta, "00000000", 1000);
			arregloCorriente[i] = corriente;
		}
		return arregloCorriente;
	}

}