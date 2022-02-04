/*pedir al usuario 2 numeros por consola y preguntarle que operacion desea realizar
1) suma
2) resta
3) Division
4) Multiplicacion

y despues imprimir el resultado
*/

import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora");
		System.out.println("Introduce el primer numero");
		Scanner sc = new Scanner (System.in);
		int n1 = sc.nextInt();
		
		System.out.println ("Introduce el segundo numero");
		Scanner sc2 = new Scanner (System.in);
		int n2 = sc2.nextInt();
		
		System.out.println ("Presiona el numero de lo que deseas hacer");
		System.out.println ("1) Suma");
		System.out.println ("2) Resta");
		System.out.println ("3) Dividir");
		System.out.println ("4) Multiplicar");
		
		Scanner sc3 = new Scanner (System.in);
		byte opcion = sc3.nextByte();
		
		
		switch(opcion) {
		case 1:
			int suma = n1 + n2;
			System.out.println("El resultado de " + n1 + " + " + n2 + " es " + suma);
			break;
		case 2:
			int resta = n1 - n2;
			System.out.println("El resultado de " + n1 + " - " + n2 + " es " + resta);
			break;
		case 3:
			double div = (double) (n1 / n2);
			System.out.println("El resultado de " + n1 + " / " + n2 + " es " + div);
			break;
		case 4:
			int multip = n1 * n2;
			System.out.println("El resultado de " + n1 + " * " + n2 + " es " + multip);
			break;
			
		}

	}
}
