package home.work.negocio;

public class Consultor extends Empleado {
	private String categoriaProfesional;

	public Consultor(String identificacion, String nombre, String apellido, String domicilio, String codigoPostal,
			String ciudad, PuestoTrabajo puestoTrabajo, String categoriaProfesional) {
		super(identificacion, nombre, apellido, domicilio, codigoPostal, ciudad, puestoTrabajo);
		this.categoriaProfesional = categoriaProfesional;
	}
	@Override
	public String getAtributos() {
		return categoriaProfesional;
	}

	public String getCategoriaProfesional() {
		return categoriaProfesional;
	}

	public void setCategoriaProfesional(String categoriaProfesional) {
		this.categoriaProfesional = categoriaProfesional;
	}

}
