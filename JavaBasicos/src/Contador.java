/*Crea una clase llamada contador

Escribe un ciclo que haga que un contador vaya de 15 a 90, contando de 3 en 3.
*/
public class Contador {
	public static void main(String[] args) {		
		
		/* Forma 1
		 * int contador = 15;
		 * 
		 * while (contador < 91) { 
		 * System.out.println("contador = " + contador);
		 * contador += 3; 
		 * }
		 */
		
		/*Forma 2
		 * do { 
		 * System.out.println("contador = " + contador); contador += 3; 
		 * } while (contador < 91);
		 */		
		
		for (int i = 15 ; i < 91; i += 3) {
			System.out.println("contador = " + i);			
		}
	}

}
