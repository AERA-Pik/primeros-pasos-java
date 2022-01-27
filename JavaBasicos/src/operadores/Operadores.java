package operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		//Operadores Aritmeticos
		// +, -< /, *, %
		int a = 10;
		int b = 20;
		double c = 10.0;
		
		int suma = a + b;
		System.out.println(suma);
		
		String str1 = "El resultado de la suma es ";
		System.out.println(str1 + suma);
		
		//resta directamente		
		System.out.println("El resultado de la resta es " + (a - b));
		
		//division en una variable
		int division = a + b;
		System.out.println("El resultado de la division es: " + division);
		
		//para double por lo menos unos de los datos debe ser de tipo double
		double division2 = c / b;
		double division3 = (double) a / b;		
		System.out.println("El resultado de la division 2 es: " + division2);
		
		//multiplicacion
		double multiplicacion = c * a;
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
		
		//modulo
		double modulo = a % c; 
		System.out.println("El modulo de la operacion es: " + modulo);
		
		/*
		 * Operador de asignacion
		 * =
		 */
		int d = 5, e; //inicializar las variables vacias
		e=6;
		System.out.println(d + "-" + e);
		
		//Operadores de declaracion compuesta
		//+=, -=, *=, %=
		//una operacion simplificada
		
		int f = 0, g = 5;
		f += 5;
		//f = f + 5
		System.out.println(f);
		
		//Operadores relacionales
		/* <, >, <=, >=
		 * == igualdad
		 * != diferencia
		 * Resultado un valor de tipo boolean
		 * */
		
		int h = 15, i = 25;
		String j = "hola";
		System.out.println(h > i); // false
		System.out.println(i != h);
		//System.out.println(h > j); son tipos de dato distintos y no se pueden comparar
		
		//Operadores Unarios
		/* ++, --
		 * preasignacion
		 * postasignacion
		 */
		int k = 0, l = 0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//precedencia de operadores
		
		int operacion = 4 + 5 * 6 / 3;
		// 5* 6 = 30
		//30 / 3 = 10
		//4 + 10 = 14
		
		System.out.println(operacion);
		
		int x = 0, y = 0;
		// x = 1, y = 0
		int operacion2 = ++x + y--;
		
		//operador ternario
		
		int edad = 19, valor1 = 0, valor2 = 1;
		int resultado = (edad <= 18) ? valor1 : valor2;
		
		// asignacion se hace entre parenetesis			
		// int resultado = (edad <= 18) ? (valor1=2) : (valor1=3);
		// para regresar cierto tipo de valor, se tiene que definir el operador con ese tipo
		// String resultado = (edad <= 18) ? "hola" : "adios";
		
		//parentesis son opcionales
		System.out.println(resultado);
		
		//OPERADORES LOGICO
		/*and - &&
		 * or ||
		 * Not !
		 * 
		 */
		
		System.out.println (true && true); //true
		System.out.println (true && false); //true
		System.out.println (true || false); //true
		System.out.println (true && !false); //true
		
		
		Scanner sc = new Scanner(System.in);
		
		//texto para mostrar en pantalla sobre lo que queremos que introduzca el usuario
		System.out.println("Escribe un numero: ");
		
		//obten un numero del scaneer y gardalo en nuestra variable
		int num = sc.nextInt();
		System.out.println(num);
		
	}
}
