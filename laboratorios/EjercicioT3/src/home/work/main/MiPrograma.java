package home.work.main;

import home.work.business.Empleado;
import home.work.business.Persona;

public class MiPrograma {
	/**
	 * Programa que permite crear un objeto empleado1 e imprimir en consola
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado("1719676234", 
										  "Lenno", 
										  "Lenny", 
										  "Gaspar de Villaroel E14", 
										  "01/01/2020", 
										  3000.0);
		empleado1.setApellido("Falconi");
		empleado1.getAtributos();
		
		Persona persona1 = new Persona("1718qw12", "Philip", "Fry", "Central Park 9820");
		persona1.getAtributos();
	}

}
