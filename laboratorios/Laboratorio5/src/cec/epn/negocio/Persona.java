package cec.epn.negocio;

public class Persona {

	private int idPersona;
	private String nombre;
	private int altura;

	public Persona(int idPersona, String nombre, int altura) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Persona-> ID: " + idPersona + " Nombre: " + nombre + " Altura: " + altura + "\n";
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
