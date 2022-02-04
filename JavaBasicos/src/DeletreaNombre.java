/*
 * Escribe un programa que pida al usuario ingresar su nombre y que entonces imprima cada una de las letras de su nombre.

Ejemplo: "Juan"
"J"
"u"
"a"
"n"
String:Aar
length()
charAt(i)

 */
import java.util.Scanner;
public class DeletreaNombre {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.println("La longitud de tu nombre es: " + nombre.length());
		
		for (int i = 0; i < nombre.length(); i++) { // String.length() Devuelve la longitud de la cadena como numero
			System.out.println(nombre.charAt(i));  //String.charAt(i) Devuelve el carácter situado en la posición i de la cadena. La primera posición de la cadena es 0.
		}
		
	
		
	}
	

}
