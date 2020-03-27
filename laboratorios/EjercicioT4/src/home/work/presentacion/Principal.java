package home.work.presentacion;

import home.work.negocio.Administrativo;
import home.work.negocio.Consultor;
import home.work.negocio.Empleado;
import home.work.negocio.PuestoTrabajo;

public class Principal {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			PuestoTrabajo puestoTrabajo = new PuestoTrabajo("001aab", "machine learning specialist", (double) 1900.34); // compilador
																														// generalmente
																														// entiende
																														// entero
			PuestoTrabajo puestoTrabajo2 = new PuestoTrabajo("consult001", "AI consulting", (double) 5500.99);
			Empleado empleado1 = new Empleado("17196762ad", "Lenno", "Inoclaf", "Gaspar Av", "17025", "quito",
					puestoTrabajo);
			System.out.println("Empleado Atributo es: " + empleado1.getAtributos());
			puestoTrabajo.setCodigo("admin666");
			puestoTrabajo.setDescription("Administrador Sistema");
			puestoTrabajo.setSueldo((double) 3000.12);
			Administrativo administrativo = new Administrativo("1719676rew", "eladmin", "nosabe", "6dic av", "12123123",
					"Quito", puestoTrabajo, 12);

//			puestoTrabajo2 = null; //forzando a error, comentar para eliminar error
			Consultor consultor = new Consultor("17196762ad", "Lenno", "Inoclaf", "Gaspar Av", "17025", "quito",
					puestoTrabajo2, "Deep Learing Specialist");

			System.out.println("Administrador Antiguedad es: " + administrativo.getAtributos());
			System.out.println("Consultor categoria profesional es: " + consultor.getAtributos());

		} catch (Exception e) {
			System.err.println("Ha ocurrido un error: " + e.getMessage());// "e" es un tipo referenciado
			e.printStackTrace();
		}

	}

}
