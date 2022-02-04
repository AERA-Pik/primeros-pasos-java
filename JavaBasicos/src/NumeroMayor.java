/*
		 * Pedir 3 números al usuario y mostrar un mensaje con el
		 * número mayor
		 * */

import java.util.Scanner;
public class NumeroMayor {
	public static void main(String[] args) {
		System.out.println("Se compararan 3 numeros y te dire el mayor");
		System.out.println("Introduzca el primer numero:");
		Scanner num1 = new Scanner(System.in);
		int n1 = num1.nextInt();
		System.out.println("Introduzca el segundo numero:");
		Scanner num2 = new Scanner(System.in);
		int n2 = num1.nextInt();
		System.out.println("Introduzca el tercer numero:");
		Scanner num3 = new Scanner(System.in);
		int n3 = num1.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println( n1 + " que es tu primer numero, es el mayor");
			
		} else if (n2 > n1 && n2 > n3) {
			System.out.println( n2 + " que es tu segundo numero, es el mayor");
			
		} else {
			System.out.println( n3 + " que es tu tercer numero, es el mayor");
			
		}
		
	}
	

}
