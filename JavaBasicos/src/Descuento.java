// solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
		// sila cuenta es de 1001 - 4999 10%
		// si la cuenta es de 5001 a 9999 20%
		// si la copra es de 10000 o más 30%

import java.util.Scanner;
public class Descuento {
	public static void main(String[] args) {
		System.out.println("Benvenuti al sistema para saber tu descuento ");
		System.out.println("Por favor introduce el total de tu compra");
		Scanner tot = new Scanner(System.in);
		double total = tot.nextDouble();
		double descuento;
		double totalFinal;
		
		if (total < 1001) { // compara si el total es menor que 1000
			descuento = 0;
			System.out.println("Usted no aplica para un descuento, El total de su compra es " + total);
			
		} else if (total >= 1000 && total <= 4999) {
			descuento =  total * 0.1; //Se calcula el descuento
			totalFinal =  total - descuento; //Se aplica el descuento
			System.out.println("Usted tiene un 10% de descuento, El total de su compra es " + totalFinal);
			
		} else if (total >= 5000 && total <= 9999) {
			descuento = total * 0.2;
			totalFinal =  total - descuento;
			System.out.println("Usted tiene un 20% de descuento, El total de su compra es " + totalFinal);
			
		} else if (total >= 10000) {
			descuento = total * 0.3;
			totalFinal = total - descuento;
			System.out.println("Usted tiene un 30% de descuento, El total de su compra es " + totalFinal);
			
		}
	}
}
