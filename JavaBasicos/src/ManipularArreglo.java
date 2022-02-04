/*
 * Crea una clase llamada ManipularArreglo
crea un array con los siguientes números enteros:

1, 6, 45, 53, 80, 102, 145, 326, 450, 892
Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.

 */
public class ManipularArreglo {

	public static void main(String[] args) {
		
		int []numeros = new int[] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int sumaTotal = 0;
		int sumaPares = 0;
		int sumaImpares = 0;
				
		for (int i = 0; i < numeros.length; i++) {
			
			sumaTotal = sumaTotal + numeros[i];
			
			if (numeros[i] % 2 == 0) { //verifica si el numero es par
				sumaPares = sumaPares + numeros[i];
				System.out.println("numero par: " + numeros[i]);
				
			} else {
				sumaImpares = sumaImpares + numeros[i];
				System.out.println("numero impar: " + numeros[i]);
			}
		}
		
		//Muestra los resultados
		System.out.println("La suma total de los numeros es: " + sumaTotal);
		System.out.println("La suma de los numeros pares es: " + sumaPares);
		System.out.println("La suma de los numeros impares es: " + sumaImpares);

	}

}
