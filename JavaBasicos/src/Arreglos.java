public class Arreglos {

	public static void main(String[] args) {
		// solo pueden almacenar 1 tipo de dato
		//Especificar el tamaño o la cantidad de elementos que va a contener
		
		//Manera 1
		int numeros[];//Se crea la variable
		numeros = new int[4]; //Creando el arreglo
		
		//Manera 2
		String[]nombres = new String[4]; // bassado en 0. [0,1,2,3]
		
		//Manera 3 Array literal
		String []nombreFrutas = new String[] {"Manzana", "Platanos", "Uva", "Pera"};
		
		numeros[0] = 10;
		numeros[1] = 8;
		numeros[2] = 100;
		numeros[3] = 200;
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		nombres[3] = "Felipe";
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros); //Muestra la posicion de memoria del array
		
		for (int i = 0; i < numeros.length; i++) { //en arrays, length es una propiedad
			System.out.println("Elementos de nuemros " + numeros[i]);
			System.out.println("Elementos de nombre " + nombres[i]);
			System.out.println("Elementos de Frutas " + nombreFrutas[i]);
			System.out.println("----------------------------------");
			
		}
	}

}
