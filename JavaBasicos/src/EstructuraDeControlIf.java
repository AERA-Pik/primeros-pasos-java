import java.util.Scanner;
public class EstructuraDeControlIf {
	public static void main(String[] args) {
		//Estructuras de control de flujo
		//Sirve para toma de decisiones, cambiar el flujo de
		//nuestro programa evaluando una condici�n, llevando
		//a cabo acciones dependiendo de el cumplimiento de
		//dicha condici�n(es)
			
		/*if (condici�n){
			c�digo
			}else{
				m�s c�digo
		}
		
		*/
			
			System.out.println("Introduce tu edad");
			Scanner sc = new Scanner(System.in);
			
			int edad = sc.nextInt();
			
			if(edad >= 18) {
				System.out.println("Eres mayor de edad");
			}else {
				System.out.println("Eres menor de edad");
			}
			
			
			
			
		}

}
