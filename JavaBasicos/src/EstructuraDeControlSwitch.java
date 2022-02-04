import java.util.Scanner;
public class EstructuraDeControlSwitch {
	
	//Estructuras de control nos sirve para controlar el flujo de comportamiento de un programa. Para la toma de decisiones 
	/*Estructura:
	 * switch (condicion_a_evaluar) {
	 * 	case "valor"
	 * 		//codigo a ejectuar;
	 * 		//break;
	 * 		case "n":
	 * 		//codigo a ejecutar;
	 * 		//break;
	 * 		default:
	 * 		//codigo a ejecutar;
	 * }
	 * 
	 */
	
	//Solicitar al usuario un dia de la semana y mostrar un mensaje
	public static void main(String[] args) {
				
		System.out.println("Introduce un día de la semana y recibe un bonito mensaje. :-)");
		Scanner sc = new Scanner (System.in);
		String dia = sc.nextLine();		
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un cafe");
			break;
		case "martes": 
			System.out.println("Que ya se acabe la semana porfavor");
			break;
		case "miercoles": 
			System.out.println("Miercoles, pero a que costo");
			break;
		case "jueves": 
			System.out.println("Juebebes de sed peligrosa");
			break;
		case "viernes": 
			System.out.println("POR FIN VIERNES");
			break;
		case "sabado": // se ejecuta el codigo con cualquiera de las dos opciones
		case "domingo":
			System.out.println("Puros jueguitos day");
			break;
		default:
			System.out.println("Dia desconocido, kha");
		}
	}
}

