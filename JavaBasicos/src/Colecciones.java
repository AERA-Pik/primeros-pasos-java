import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Colecciones {

	public static void main(String[] args) {
		// Las colecciones nos sirven para almacenar un conjunto de objetos
		// La diferencia de las colecciones y los objetos, es que son dinamicas
		// El numero de objetos agregados
		
		// Set tiene 3 implementaciones
		// no puede contener elementos repetidos
		// HashSet
		// los elementos no mantienen un orden
		// Es la implementacion mas rapida
		
		/*
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		*/
		
		
		/*
		 * foreach, puede recorrer una coleccion y en cada recorrido recupera el valor
		 * y lo podemos almacenar en una variable
		 * Sintaxis:
		 * for(tipoDeDatosElemento variable : elementoAReccorrer)
		
		for (String fruta : frutas) {
			System.out.println(fruta);			
		}
		*/
		
		
		// TreeSet
		// Esta implementacion ordena los elementos en funcion
		//de sus valores
		//es la implementacion mas lenta
		
		/*
		Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for (String fruta : frutas) {
			System.out.println(fruta);			
		}
		*/
		
		// LinkedHashSet
		// ordena los elementos respetando el orden de insercion
		// es mas costoso que HashSet
		/*
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for (String fruta : frutas) {
			System.out.println(fruta);
			*/
		
		// List
		// se permiten elementos duplicados
		// acceder a elementos especificos
		// buscar elementos
		
		// ArrayList
		
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("Chikorita");
		pokemones.add("Eevee");
		pokemones.add("Psyduck");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		
		// add si agregamos un indice y un elemento, posciona el elementos indice  y realiza un desplazamiento
		// es decir no borra el elemento en la posicion si no que lo reemplaza
		pokemones.add(2, "Pikachu");
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("**************");
		System.out.println(pokemones.get(4));
		
		// IndexOf, nos va a devolver la posicion del primer elemento que coincida y si el elemento no se encuentra en el sistema nos devuelve -1
		System.out.println(pokemones.indexOf("Gengar"));
		System.out.println(pokemones.indexOf("Togepi"));
		
		// Elimina el elemento de la posicion especificada
		pokemones.remove(5);
		
		// set reemplza el elemento en la posicion especificada
		pokemones.set(0, "Flareon");
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("**************");
		
		// LinkedList
		// Es una lista doblemente enlazada
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		// Map
		// similar a arreglos en JS
		// Asocia claves a valores
		// No puede contener claves duplicadas
		// Solo puede tener un valor asociado.
		
		// HashMap
		// Tiene mejor rendimientto pero no garantiza un orden
		// a la hora de hacer iteraciones
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Aaron Eduardo");
		usuarios.put(2, "Carlos Eduardo");
		usuarios.put(3, "Ro");
		
		
		System.out.println(usuarios.get(1));
		
		// keySet
		// Nos permite recuperar el nombre de la clave
		System.out.println(usuarios.keySet());
		
		// values
		// Nos permite recuperar el valor directamente
		System.out.println(usuarios.values());
		
		//TreeMap
		Map<String, String> tamales = new TreeMap<String, String>();
		tamales.put("Oaxaqueño", "Mole Rojo");
		tamales.put("1","Mole verde");
		tamales.put("Dulces", "Gansito");
		tamales.put("Salado","Cochinita");
		
		System.out.println("**************");
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		System.out.println(tamales);
		
		tamales.entrySet().forEach(elemento -> { // funcion lambda
			System.out.println(elemento.getKey());
			System.out.println(elemento.getValue());
		});
		
		//LinkedHashMap
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		carros.put(1, "Volvo");
		carros.put(567, "Pointer");
		carros.put(9, "Mustang");
		
		System.out.println("*************");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
	}

}
