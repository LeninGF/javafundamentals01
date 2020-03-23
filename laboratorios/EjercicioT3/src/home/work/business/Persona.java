package home.work.business;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private String domicilio;
	
	public Persona(String dni, String nombre, String apellido) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Persona(String dni, String nombre, String apellido, String domicilio) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.dni = dni;
	}
	
	public void getAtributos() {
		System.out.println("DNI: "+this.dni+" "+this.apellido+" "+this.nombre+" "+this.domicilio);
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
	
	
}
