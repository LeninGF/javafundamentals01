package home.work.negocio;

public class Empleado {
	/**
	 * Clase Empleado que contiene atributos como
	 * dni: numero de identificacion
	 * nombre, apellido: nombres de nacimienito de ciudadano
	 * fechaContratacion: fecha de ingreso y contrato en el trabako
	 * @author leninml
	 * 
	 */
	private String dni;
	private String nombre;
	private String apellido;
	private String domicilio;
	private String codigoPostal;
	private String ciudad;
	// atributo puestoTrabajo de la clase PuestoTrabajo
	private PuestoTrabajo puestoTrabajo; // debo usar el modificador de acceso???
	
	// Constructor
	public Empleado(String dni, String nombre, String apellido, String domicilio, String codigoPostal, String ciudad,
			PuestoTrabajo puestoTrabajo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.puestoTrabajo = puestoTrabajo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public PuestoTrabajo getPuestoTrabajo() {
		return puestoTrabajo;
	}

	public void setPuestoTrabajo(PuestoTrabajo puestoTrabajo) {
		this.puestoTrabajo = puestoTrabajo;
	}
	
	
	

	
	
		
	
	
}
