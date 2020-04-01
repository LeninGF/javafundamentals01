package cec.epn.presentacion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import cec.epn.negocio.Persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implementar interface Sets");
		Principal principal = new Principal();
		principal.implementarHashSet();

	}

	private void implementarHashSet() {
		Set<Persona> hashSetPersonas = new HashSet<Persona>();
		Random r = new Random();
		Persona persona = null;
		int sumaAltura = 0;
		for (int i = 0; i < 100; i++) {
			hashSetPersonas.add(new Persona(i, "Persona #" + i, r.nextInt(100) + 100));
		}
		Iterator<Persona> it = hashSetPersonas.iterator();
		while (it.hasNext()) {
			persona = it.next();
			System.out.println(persona);
			sumaAltura += persona.getAltura();
		}
		System.out.println("La media de altura del conjunto de Personas es: " + sumaAltura / hashSetPersonas.size());
	}

}
