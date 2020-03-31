package cec.epn.negocio;

import java.util.Date;

public class Empleado extends Persona implements Constantes {
	private String cargo;
	private float sueldo;

	@Override
	public float calcularImpuestoRenta() {
		// TODO Auto-generated method stub
		float impuestoRenta = 0;
		impuestoRenta = this.sueldo*Constantes.PORCENTAJERENTAEMPLEADO;
		return impuestoRenta;
	}

	public Empleado(String identificiacion, String nombres, String direccion, Date fechaNacimiento, String cargo,
			float sueldo) {
		super(identificiacion, nombres, direccion, fechaNacimiento);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
