package metodos;

public class Metodos {
	
	// Metodos es una funcion
	
	//atributos de la clase
	int a, b;
	
	//Metodo void (vacio)
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " mas " + b + " es " + resultado);
	}
	
	//metodos con retorno de valores
	public int sumaConRetorno() {
		//int resultado = a + b;
		
		return a + b;		
	}
	
	//argumentos
	// suma(argumentos)
	 
	public double mulplicarConArgumentos(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		return c * d;
	}
	
	//Metodo estricto
	
	public static void imprimirNombre(String Nombre) {
		
	}

}
