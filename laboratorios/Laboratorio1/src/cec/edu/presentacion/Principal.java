package cec.edu.presentacion;

import cec.edu.negocio.Ahorros;
import cec.edu.negocio.Corriente;
import cec.edu.negocio.Servicio;

public class Principal {
	// La clase principal es el punto de ejecución del proyecto
	// El método void main permite que se ejecute el proyecto como tal
	
	// ciclo desarrollo + compilacion + ejecucion
	
	public static void main(String []args) {
		System.out.println("*******Laboratorio - 01 - *******");  // imprime a pantalla
		// Crear una instancia (lowercamelcase) de la Clase Ahorros , la instancia ahorros es minuscula
		Ahorros ahorros = new Ahorros("4102565478", (float) 50.20, "1719676239", "AHORRO FUTURO"); // NOTAR OPERACION DE CASTING EN FLOAT
		Corriente corriente = new Corriente("4102565478", (float)50.0, "1719676239", (float)2000.0);
		Servicio servicio = new Servicio("EEQ1719", (float) 20.0, "1719676239", false);
		
		System.out.println("Numero de Cuenta: "+ahorros.getNumeroCuenta());
		System.out.println("Saldo actual: "+ahorros.getSaldoCuenta());
		
	}
	

	
}
