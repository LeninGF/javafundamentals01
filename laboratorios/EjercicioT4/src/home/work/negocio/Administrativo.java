package home.work.negocio;

public class Administrativo extends Empleado {
	private int antiguedad;

	public Administrativo(String identificacion, String nombre, String apellido, String domicilio, String codigoPostal,
			String ciudad, PuestoTrabajo puestoTrabajo, int antiguedad) {
		super(identificacion, nombre, apellido, domicilio, codigoPostal, ciudad, puestoTrabajo);
		this.antiguedad = antiguedad;
	}
	@Override
	public String getAtributos() {
		return String.valueOf(antiguedad);
	}
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

}
