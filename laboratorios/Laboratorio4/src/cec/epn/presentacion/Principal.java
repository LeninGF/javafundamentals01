package cec.epn.presentacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cec.epn.negocio.Empleado;
import cec.epn.negocio.Estudiante;
import cec.epn.negocio.Profesor;

public class Principal {
	/**
	 * Metodo para convertir una String en formato yyyy-MM-dd a una Fecha Date
	 * 
	 * @param dateStr: String con la fecha en "yyyy-MM-dd"
	 * @return: Fecha en tipo de dato Date
	 */
	private Date str2Date(String dateStr) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date myBDay = null;
		try {
			myBDay = format.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myBDay;
	}

	/**
	 * Metodo Principal para Correr en Consola
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal princ = new Principal();

		System.out.println("Objeto Profesor tiene atributos: ");
		Profesor profe1 = new Profesor("171967qw39", "Richard Dawkins", "Planet Express", princ.str2Date("1990-06-05"),
				"MachineLearning Spec", "Msc", (float) 3500.0, (float) 200.0);
		System.out.println("Nombres: " + profe1.getNombres());
		System.out.println("Sueldo: " + profe1.getSueldo());
		System.out.println("Bono: " + profe1.getBonoRendimiento());
		System.out.println("Fecha Naci: " + profe1.getFechaNacimiento().toString());
		System.out.println("Edad: " + profe1.calcularEdad());
		System.out.println("Impuesto a pagar: " + profe1.calcularImpuestoRenta());

		System.out.println("=========================================================");
		System.out.println("Objeto Estudiante tiene atributos: ");
		Estudiante estud1 = new Estudiante("abcdef", "Charles Darwin", "Galapagos", princ.str2Date("1880-08-12"),
				"Biology", (float) 18);
		System.out.println("Nombres: " + estud1.getNombres());
		System.out.println("Promedioo: " + estud1.getNotaPromedio());
		System.out.println("Curso: " + estud1.getCurso());
		System.out.println("Fecha Naci: " + estud1.getFechaNacimiento().toString());
		System.out.println("Edad: " + estud1.calcularEdad());
		System.out.println("Impuesto a pagar: " + estud1.calcularImpuestoRenta());

		System.out.println("=========================================================");
		System.out.println("Objeto Empleado tiene atributos: ");
		Empleado empleado1 = new Empleado("qwert123", "Albert Einstein", "Stanford", princ.str2Date("1905-05-05"),
				"Oficina Patentes", (float) 1000.99);
		System.out.println("Nombres: " + empleado1.getNombres());
		System.out.println("Cargo: " + empleado1.getCargo());
		System.out.println("Fecha Naci: " + empleado1.getFechaNacimiento().toString());
		System.out.println("Edad: " + empleado1.calcularEdad());
		System.out.println("Impuesto a pagar: " + empleado1.calcularImpuestoRenta());

	}

}
