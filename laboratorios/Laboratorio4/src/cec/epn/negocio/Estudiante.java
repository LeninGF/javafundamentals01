package cec.epn.negocio;

import java.util.Date;

/**
 * Clase Estudiante, hereda de Persona
 * 
 * @author leninml
 *
 */
public class Estudiante extends Persona {
	private String curso;
	private float notaPromedio;

	/**
	 * Metodo calcularImpuestoRenta sobrescribe al método abstracto en Persona
	 * 
	 * @return devuelve 0, porque esta clase no declara renta
	 */
	@Override
	public float calcularImpuestoRenta() {
		return 0;
	}

	/**
	 * Clase Estudiante Constructor
	 * 
	 * @param identificiacion
	 * @param nombres
	 * @param direccion
	 * @param fechaNacimiento: Tipo Date
	 * @param curso
	 * @param notaPromedio
	 */
	public Estudiante(String identificiacion, String nombres, String direccion, Date fechaNacimiento, String curso,
			float notaPromedio) {
		super(identificiacion, nombres, direccion, fechaNacimiento);
		this.curso = curso;
		this.notaPromedio = notaPromedio;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public float getNotaPromedio() {
		return notaPromedio;
	}

	public void setNotaPromedio(float notaPromedio) {
		this.notaPromedio = notaPromedio;
	}

}
