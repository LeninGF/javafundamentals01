package home.work.business;

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
	private String fechaContratacion;
	private double sueldo;
	
	// Constructor
	public Empleado(String dni, String nombre, String apellido, String domicilio, String fechaContr, double sueldo) {
		/**
		 * Constructor Empleado
		 * @author leninml
		 */
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.fechaContratacion = fechaContr;
		this.sueldo = sueldo;
	}
	
	// Metodo getAtributos()
	public void getAtributos() {
		/**
		 * Imprime los atributos del Empleado
		 */
		System.out.println("DNI: "+this.dni+" "+this.apellido+" "+this.nombre+" "+this.fechaContratacion+" "+this.sueldo);
	}
	
	// Setters and Getters
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
	public String getFechaContratacion() {
		return fechaContratacion;
	}
	public void setFechaContratacion(String fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
}
