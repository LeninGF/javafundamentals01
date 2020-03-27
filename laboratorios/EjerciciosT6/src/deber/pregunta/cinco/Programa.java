package deber.pregunta.cinco;

import java.util.Scanner;


public class Programa {

	private double producto(float numberN, float numberM) {
		double result = 0;
		for(int i=0; i<numberN; i++) {
			result+=numberM;
		}
		
		return result;
	}
	
	private double elevar(float base, float exponente) {
		double valor =1;
		int cont = 0;
		while(cont<exponente) {
			valor*=base;
			cont+=1;
		}
		return valor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Programa programa = new Programa();
		System.out.println("Testing Product by using For Loop and Addition");
		double respuesta;
		System.out.println("Enter first number:");
		float numb1 = scan.nextFloat();
		System.out.println("Enter second number");
		float numb2 = scan.nextFloat();
		respuesta = programa.producto(numb1, numb2);
		System.out.println("Respuesta "+respuesta);
		
		System.out.println("Testing exponent function");
		respuesta = programa.elevar(numb1, numb2);
		System.out.println("Respuesta "+ respuesta);
	}

}
