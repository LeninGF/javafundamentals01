package cec.edu.presentacion;

import java.util.Scanner;

import cec.edu.negocio.Ahorros;
import cec.edu.negocio.CargaMasiva;
import cec.edu.negocio.Corriente;
import cec.edu.negocio.Servicio;

/**
 * Company: Atenatronix Corp
 * 
 * @author Lenin G. Falconi
 * @version 1.0.0 {@Company} Atenatronix Corp
 */
public class Principal {
	// La clase principal es el punto de ejecuci�n del proyecto
	// El m�todo void main permite que se ejecute el proyecto como tal

	// ciclo desarrollo + compilacion + ejecucion
	/**
	 * @author leninml
	 * 
	 */
	/**
	 * Simulacion de Cuentas por arreglos
	 */
	private Corriente[] arregloCorriente; // corchetes = arreglo
	private Ahorros[] arregloAhorros;
	private Servicio[] arregloServicios;

	/**
	 * Inicializacion de cuentas de Ahorro
	 */
	public Principal() {
		// El constructor es primer metodo que se ejecuta
		arregloAhorros = new Ahorros[100];
		arregloCorriente = new Corriente[100];
		arregloServicios = new Servicio[100];
	}
	
	private void cargarDatos() {
		CargaMasiva cargaMasiva = new CargaMasiva();
		arregloAhorros = cargaMasiva.cargarAhorro(arregloAhorros);
		arregloCorriente = cargaMasiva.cargarCorriente(arregloCorriente);
	}

	private void subMenuAhorros() {
		/**
		 * 
		 */
		int opcionIngresada = 0;
		do {
			System.out.println("Menu de Ahorros");
			System.out.println("1.- Deposito");
			System.out.println("2.- Retiro");
			System.out.println("3.- Menu Principal");
			System.out.println("\t\tSu opción actual es: " + opcionIngresada);
			Scanner scanner2 = new Scanner(System.in);
			opcionIngresada = scanner2.nextInt();
			switch (opcionIngresada) {
			case 1: {

				break;
			}
			case 2:
				break;
			case 3:
				System.out.println("Sub Menu Ahorros finalizado");
				break;

			default:
				System.out.println("Opcion incorrecta");
				System.out.println("Presiona enter para intentar de nuevo");
				scanner2 = new Scanner(System.in);
				scanner2.nextLine();
			}
		} while (opcionIngresada != 3);
	}

	private void subMenuCorriente() {
		int opcionIngresada = 0;
		do {
			System.out.println("Sub Menu Cuentas Corrientes");
			System.out.println("1.- Deposito");
			System.out.println("2.- Retiro");
			System.out.println("3.- Salir");
			System.out.println("\t\tSu opción actual es: " + opcionIngresada);
			Scanner scanner = new Scanner(System.in);
			opcionIngresada = scanner.nextInt();

			switch (opcionIngresada) {
			case 1: {

				break;
			}
			case 2:
				break;
			case 3:
				break;
			default:
//				throw new IllegalArgumentException("Unexpected value: " + opcionIngresada);
				System.out.println("Opcion incorrecta");
				System.out.println("Presiona enter para intentar de nuevo");
				scanner = new Scanner(System.in);
				scanner.nextLine();

			}

		} while (opcionIngresada != 3);
	}

	private float operacionCuenta(String operacionEntrada, String numeroCuenta, float valorProcesar) {
		Ahorros cuentaEncontrada;
		float saldoCuenta = 0;
		boolean banderaDeposito = false;
		if (operacionEntrada.equals("1")) {
			// Ejecutar Deposito
			for (int i = 0; i < arregloAhorros.length; i++) {
				if (numeroCuenta.equals(arregloAhorros[i].getNumeroCuenta())) {
					cuentaEncontrada = arregloAhorros[i];
					saldoCuenta = cuentaEncontrada.depositoCuenta(valorProcesar);
					banderaDeposito = true;
					break;
				}
			}
			if (!banderaDeposito) {
				System.err.println("\t\t\t******ERROR NUMERO DE CUENTA NO EXISTE ******");
			}
		}
		return saldoCuenta;
	}

	private void menuPrincipal() {
		/**
		 * @author leninml
		 * 
		 */

		int opcionIngresada = 0;

		do {
			System.out.println("====== Menu de opciones Principal======");
			System.out.println("Selecciona un número de acuerdo a la transacción a realizar");
			System.out.println("1.- Cuentas de Ahorro");
			System.out.println("2.- Cuentas Corriente");
			System.out.println("3.- Pagos de Servicios");
			System.out.println("4.- Salir");
			System.out.println("\t\tSu opción actual es: " + opcionIngresada);
			Scanner scanner = new Scanner(System.in); // inicializa un objeto Scanner para leer entradas teclado
			opcionIngresada = scanner.nextInt();

			switch (opcionIngresada) {
			case 1: {

				this.subMenuAhorros();
				break;
			}
			case 2: {
				subMenuCorriente();
				break;
			}
			case 3: {
				System.out.println("hola 3 ");
				break;
			}
			case 4: {
				System.out.println("Ha salido de la aplicación");
				break;
			}
			default:
//					throw new IllegalArgumentException("Unexpected value: " + opcionIngresada);
				System.out.println("******* Opcion Incorrecta *******");
				System.out.println("Presionar enter para continuar");
				scanner = new Scanner(System.in);
				scanner.nextLine();
				break;
			}
		} while (opcionIngresada != 4);

	}

	public static void main(String[] args) {
		System.out.println("*******Laboratorio - 01 - *******"); // imprime a pantalla
		// Crear una instancia (lowercamelcase) de la Clase Ahorros , la instancia
		// ahorros es minuscula
//		Ahorros ahorros = new Ahorros("4102565478", (float) 50.20, "1719676239", "AHORRO FUTURO"); // NOTAR OPERACION DE CASTING EN FLOAT
//		Corriente corriente = new Corriente("4102565478", (float)50.0, "1719676239", (float)2000.0);
//		Servicio servicio = new Servicio("EEQ1719", (float) 20.0, "1719676239", false);

//		System.out.println("Numero de Cuenta: "+ahorros.getNumeroCuenta());
//		System.out.println("Saldo actual: "+ahorros.getSaldoCuenta());

		Principal principal = new Principal();

		principal.menuPrincipal();

	}

}
