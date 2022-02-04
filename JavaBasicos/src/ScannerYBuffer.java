import java.util.Scanner;
public class ScannerYBuffer {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int numero1 = sc.nextInt();
		sc.nextLine(); //limpiar el buffer de la /n que queda dentro
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
					
		System.out.println("Tu nombre es: " + nombre 
				+ ".  Tu Numero es: " + numero1);		
	}

}
