/*Pedirle 3 ángulos a un usuario y decirle si es un triangulo válido*/

import java.util.Scanner;
public class EsTriangulo {
	public static void main(String[] args) {
		
		System.out.println("Se te pediran 3 angulos y te dire si es posible que sea un triangulo");
		
		System.out.println("Introduce el primer angulo:");
		Scanner a = new Scanner(System.in);
		int ang1 = a.nextInt();
		
		System.out.println("Introduce el segundo angulo:");
		Scanner b = new Scanner(System.in);
		int ang2 = b.nextInt();
		
		System.out.println("Introduce el tercer angulo:");
		Scanner c = new Scanner(System.in);
		int ang3 = c.nextInt();
		
		int suma = ang1 + ang2 + ang3;
		
		if (suma == 180) {
			System.out.println("Tus angulos son validos y puedes construir un triangulo con ellos");
		} else {
			System.out.println("Tus angulos no son validos, recuerda que para construir un triangulo la suma de sus angulos internos debe ser 180");
		}
	}
}
