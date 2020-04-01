package cec.epn.negocio;

import java.time.Year;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase Padre Persona
 * 
 * @author leninml
 *
 */
public abstract class Persona {
	protected String identificiacion;
	protected String nombres;
	protected String direccion;
	protected Date fechaNacimiento;

	/**
	 * Declaración de método abstracto para calcular impuesto a la renta en
	 * subclases
	 * 
	 * @return
	 */
	public abstract float calcularImpuestoRenta();

	/**
	 * Determina la Edad de la persona en función del año de nacimiento
	 * 
	 * @return valor entero correspondiente a la edad
	 */
	public int calcularEdad() {
		int currentYear = Year.now().getValue();
		int yearBirth = getYearFromDate(this.fechaNacimiento);
		int age = currentYear - yearBirth;
		return age;
	}

	/**
	 * Método que permite extraer el año desde una fecha en formato Date
	 * 
	 * @param date: fecha de nacimiento en formato Date
	 * @return: devuelve un entero con los digitos del año
	 */
	private int getYearFromDate(Date date) {
		int year = 0;
		String dateStr = date.toString().replaceAll("\\s+", "");
		Pattern p = Pattern.compile("(.*)ECT(\\d+)");
		Matcher m = p.matcher(dateStr);
		if (m.matches()) {
			year = Integer.parseInt(m.group(2));
		}

		return year;

	}

	/**
	 * Constructor de Clase Padre Persona
	 * 
	 * @param identificiacion
	 * @param nombres
	 * @param direccion
	 * @param fechaNacimiento: tipo Date
	 */
	public Persona(String identificiacion, String nombres, String direccion, Date fechaNacimiento) {

		this.identificiacion = identificiacion;
		this.nombres = nombres;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getIdentificiacion() {
		return identificiacion;
	}

	public void setIdentificiacion(String identificiacion) {
		this.identificiacion = identificiacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
