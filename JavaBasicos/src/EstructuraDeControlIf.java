import java.util.Scanner;
public class EstructuraDeControlIf {
	public static void main(String[] args) {
		//Estructuras de control de flujo
		//Sirve para toma de decisiones, cambiar el flujo de
		//nuestro programa evaluando una condición, llevando
		//a cabo acciones dependiendo de el cumplimiento de
		//dicha condición(es)
			
		/*if (condición){
			código
			}else{
				más código
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
