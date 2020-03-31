package cec.epn.negocio;

import java.util.Date;

public class Profesor extends Persona implements Constantes {
	private String profesion;
	private String nivelFormacion;
	private float sueldo;
	private float bonoRendimiento;

	public Profesor(String identificiacion, String nombres, String direccion, Date fechaNacimiento, String profesion,
			String nivelFormacion, float sueldo, float bonoRendimiento) {
		super(identificiacion, nombres, direccion, fechaNacimiento);
		this.profesion = profesion;
		this.nivelFormacion = nivelFormacion;
		this.sueldo = sueldo;
		this.bonoRendimiento = bonoRendimiento;
	}

	@Override
	public float calcularImpuestoRenta() {
		// TODO Auto-generated method stub
		float impuestoRenta = 0;
		impuestoRenta = (this.sueldo+this.bonoRendimiento)*Constantes.PORCENTAJERENTAPROFESOR;
		
		return impuestoRenta;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getNivelFormacion() {
		return nivelFormacion;
	}

	public void setNivelFormacion(String nivelFormacion) {
		this.nivelFormacion = nivelFormacion;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public float getBonoRendimiento() {
		return bonoRendimiento;
	}

	public void setBonoRendimiento(float bonoRendimiento) {
		this.bonoRendimiento = bonoRendimiento;
	}

}
