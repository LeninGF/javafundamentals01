package cec.edu.presentacion;


import java.util.Scanner;

import cec.edu.negocio.Ahorros;
import cec.edu.negocio.Corriente;
import cec.edu.negocio.Servicio;

public class Principal {
	// La clase principal es el punto de ejecuci�n del proyecto
	// El m�todo void main permite que se ejecute el proyecto como tal
	
	// ciclo desarrollo + compilacion + ejecucion
	private static void menuPrincipal() {
		Scanner scanner = new Scanner(System.in);  //inicializa un objeto Scanner para leer entradas teclado
		int opcionIngresada=0;
		
		do {
			System.out.println("====== Menu de opciones Principal======");
			System.out.println("Selecciona un número de acuerdo a la transacción a realizar");
			System.out.println("1.- Cuentas de Ahorro");
			System.out.println("2.- Cuentas Corriente");
			System.out.println("3.- Pagos de Servicios");
			System.out.println("4.- Salir");
			System.out.println("Su opción actual es: "+opcionIngresada);	
			opcionIngresada = scanner.nextInt();
			
			switch (opcionIngresada) {
				case 1: {
					
					System.out.println("hola 1");
					break;
				}
				case 2:{
					System.out.println("hola 2");
					break;
				}
				case 3:{
					System.out.println("hola 3 ");
					break;
				}
				case 4:{
					System.out.println("Ha salido de la aplicación");
					break;
				}
//				default:
//					throw new IllegalArgumentException("Unexpected value: " + opcionIngresada);
				}
		}while(opcionIngresada!=4);
		

	}
	
	public static void main(String []args) {
		System.out.println("*******Laboratorio - 01 - *******");  // imprime a pantalla
		// Crear una instancia (lowercamelcase) de la Clase Ahorros , la instancia ahorros es minuscula
//		Ahorros ahorros = new Ahorros("4102565478", (float) 50.20, "1719676239", "AHORRO FUTURO"); // NOTAR OPERACION DE CASTING EN FLOAT
//		Corriente corriente = new Corriente("4102565478", (float)50.0, "1719676239", (float)2000.0);
//		Servicio servicio = new Servicio("EEQ1719", (float) 20.0, "1719676239", false);
		
//		System.out.println("Numero de Cuenta: "+ahorros.getNumeroCuenta());
//		System.out.println("Saldo actual: "+ahorros.getSaldoCuenta());
		
		menuPrincipal();
		
	}
	

	
}
