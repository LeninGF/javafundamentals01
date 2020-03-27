package home.work.negocio;

/**
 * Clase Puesto de Trabajo
 * 
 * @author leninml
 *
 */
public class PuestoTrabajo {

	private String codigo;
	private String description;
	private double sueldo;

	public PuestoTrabajo(String codigo, String description, double sueldo) {
		this.codigo = codigo;
		this.description = description;
		this.sueldo = sueldo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	

}
