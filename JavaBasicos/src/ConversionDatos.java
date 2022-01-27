
public class ConversionDatos {
	
	public static void main(String[] args) {
		
		byte numeroByte = 10;
		
		short numeroShort = numeroByte;
		
		int numeroInt = numeroShort;
		
		long numeroLomg = numeroInt;
		
		//Parseo: convertir numeros 
		
		int otroInt = (int) numeroLomg;
		
		short otroShort = (short) otroInt;
		
		short numero1 = 123;
		short numero2 = 7343;
		byte numero3 = 12;
		byte numero4 = 33;
		
		
		// para operaciones aritmeticas se tiene que utilizar int o indicar que los operandos son del tipo especifico con el parentesis
		short suma = (short) (numero1 + numero2);// conversion explicita
		byte suma2 = (byte) (numero3 + numero4);
		int suma3 = numero3 + numero4; //manera normal
		short suma4 = (short) (numero1 + numero3);
			
		
		
	}

}
