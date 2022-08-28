package ejemplodos;

public class TipoDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enteros - int, long, byte, short
		byte numByte = -128;
		System.out.println(numByte);
		short numShort = 32_767;
		System.out.println(numShort);
		int numInt = -2_147_483_648;
		System.out.println(numInt);
		long numLong = 222222222;
		System.out.println(numLong);
		System.out.println("------------------------------------");
		
		byte num1=100, num2=100;
		short num3 = (short)(num1 + num2);
		System.out.println("El valor de numm3 es: " + num3);
		
		
		//Reales - double, float
		//Booleanos - true, false
		//Caracter - char

	}

}
