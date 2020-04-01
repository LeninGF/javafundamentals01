package cec.edu.presentacion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import cec.edu.negocio.Persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal principal=new Principal();
		principal.implementarHashMap();
	}
	
	public void implementarHashMap() {
		Map<Integer, Persona> hasHMapPersona = new HashMap<Integer, Persona>();
		Random r = new Random();
		Persona persona = null;
		int sumaAltura = 0;
		for (int i = 0; i < 100; i++){
			hasHMapPersona.put(i,new Persona(i, "Persona #" + i, r.nextInt(100) + 100));
		}
		Iterator<Integer> it = hasHMapPersona.keySet().iterator();
		while (it.hasNext()){
			Integer key = (Integer) it.next();
			persona=hasHMapPersona.get(key);
			System.out.println("Clave: " + key + " -> Valor: " + persona);
			sumaAltura += persona.getAltura();
		}
		System.out.println("La media de altura del conjunto de Personas es: " + sumaAltura / hasHMapPersona.size());        
	}
}
