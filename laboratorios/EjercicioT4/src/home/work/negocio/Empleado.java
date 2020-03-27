package home.work.negocio;
/**
 * Clase empleado que contiene atributos
 * dni
 * nombre
 * apellido
 * @author leninml
 *
 */
public class Empleado {
	
	private String identificacion;
	private String nombre;
	private String apellido;
	private String domicilio;
	private String codigoPostal;
	private String ciudad;
	// atributo puestoTrabajo de la clase PuestoTrabajo
	protected PuestoTrabajo puestoTrabajo; // 
	
	/**
	 * Constructor de la clase Empleado
	 * @param identificacion: número de identificación del empleado
	 * @param nombre: un string representando el nombre
	 * @param apellido
	 * @param domicilio
	 * @param codigoPostal
	 * @param ciudad
	 * @param puestoTrabajo
	 */
	public Empleado(String identificacion, String nombre, String apellido, String domicilio, String codigoPostal,
			String ciudad, PuestoTrabajo puestoTrabajo) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.puestoTrabajo = puestoTrabajo;
	}
	/**
	 * Metodo que devuelve la descripcion del puesto de trabajo
	 * @return: devuelve la descripcion del puesto de trabajo
	 */
	public String getAtributos() {
		return puestoTrabajo.getDescription();
	}

	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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
