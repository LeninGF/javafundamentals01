package cec.epn.negocio;

import java.util.Date;

public class Estudiante extends Persona {
	private String curso;
	private float notaPromedio;

	@Override
	public float calcularImpuestoRenta() {
		return 0;
	}

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
