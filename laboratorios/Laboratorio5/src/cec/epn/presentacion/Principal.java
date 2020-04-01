package cec.epn.presentacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import cec.epn.negocio.Persona;

public class Principal {

	public static void main(String[] args) {
		Principal principal = new Principal();
		System.out.println("IMPLEMENTAR INTERFACE LIST");
		principal.implementarArrayList();
		System.out.println("IMPLEMENTAR INTERFACE LINKED LIST");
		principal.implementarLinkedList();

	}

	public void implementarArrayList() {
		List<Persona> listaPersonas = new ArrayList<Persona>(); // El tipo es List y lo implementamos con ArrayList
		Random r = new Random();
		Persona persona = null;
		int sumaAltura = 0;
		for (int i = 0; i < 100; i++) {
			listaPersonas.add(new Persona(i, "Persona #" + i, r.nextInt(100) + 100));
		}
		// Imprimir las personas ingresadas en la lista
		Iterator<Persona> it = listaPersonas.iterator();
		while (it.hasNext()) {
			persona = it.next();
			System.out.println(persona);
			sumaAltura += persona.getAltura();
		}
		System.out.println("La media de altura del conjunto de Personas es: " + sumaAltura / listaPersonas.size());
	}

	public void implementarLinkedList() {
		List<Persona> listaPersonas = new LinkedList<Persona>();
		Random r = new Random();
		Persona persona = null;
		int sumaAltura = 0;
		for (int i = 0; i < 1000; i++) {
			listaPersonas.add(new Persona(i, "Persona #" + i, r.nextInt(100) + 100));
		}
		// Imprimir las personas ingresadas en la lista
		Iterator<Persona> it = listaPersonas.iterator();
		while (it.hasNext()) {
			persona = it.next();
			System.out.println(persona);
			sumaAltura += persona.getAltura();
		}
		System.out.println("La media de altura del conjunto de Personas es: " + sumaAltura / listaPersonas.size());

	}

}
