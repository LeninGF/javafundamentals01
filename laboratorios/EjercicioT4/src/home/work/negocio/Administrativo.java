package home.work.negocio;

public class Administrativo extends Empleado {
	private int antiguedad;

	public Administrativo(String dni, String nombre, String apellido, String domicilio, String codigoPostal,
			String ciudad, PuestoTrabajo puestoTrabajo, int antiguedad) {
		super(dni, nombre, apellido, domicilio, codigoPostal, ciudad, puestoTrabajo);
		this.antiguedad = antiguedad;
	}
	
}
