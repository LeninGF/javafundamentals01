package home.work.negocio;

public class Consultor extends Empleado {
	private String categoriaProfesional;

	public Consultor(String dni, String nombre, String apellido, String domicilio, String codigoPostal, String ciudad,
			PuestoTrabajo puestoTrabajo, String categoriaProfesional) {
		super(dni, nombre, apellido, domicilio, codigoPostal, ciudad, puestoTrabajo);
		this.categoriaProfesional = categoriaProfesional;
	}
	
	
}
