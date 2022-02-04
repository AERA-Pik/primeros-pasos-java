
public class Ciclos {

	public static void main(String[] args) {
			// while		
			int control = 0;
			
			while (control < 10) {
				System.out.println("control1 = " + control);
				control++;
			}
				
			// do while
			int  control2 = 3;
			do {
				//codigo a ejecutar
				System.out.println("control2 = " + control2);
				//modificar la variable de control++
				control++;
			} while (control2 < 3);
			
			//for
			for (int i=0; i < 10; i++) {
				System.out.println("Control3 = " + i);			
			}
			
			//break & continue
			for (int i=0; i < 10; i++) {
				if (i % 2 == 0) { //solo se muestra cuando el valor de i sea numero par
					
					continue;// permite saltarnos una ejecucion del ciclo
					//deja continue
				}
				System.out.println("Control4 = " + i);
			}
		
		}
}

