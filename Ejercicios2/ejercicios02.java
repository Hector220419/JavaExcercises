package exercises;

import java.util.Arrays;

public class Exercises02{
	public static void main(String[] args) {
		
		tenPrimeNumbers();
		add(5,6);
		palindrome(22);
		addwLoops(999999999);
		emptySpace("Hola mundo");
		invString("Hola");
	}
	
	private static void tenPrimeNumbers(){
		// 1. Escribir mostrar en pantalla los primeros 100 numeros primos
		int cValues = 1000;
		int[] values = new int[cValues];
		values[0] = 4;
		for (int i = 1; i < cValues; i++) {
			values[i] += values[0] + i;
		}
		int[] primeValues = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		for (int i = 0; i < cValues; i++) {
			if (values[i] % 2 != 0 && values[i] % 3 != 0 && values[i] % 5 != 0 && values[i] % 7 != 0
					&& values[i] % 11 != 0 && values[i] % 13 != 0 && values[i] % 17 != 0 && values[i] % 19 != 0
					&& values[i] % 23 != 0) {
				primeValues = Arrays.copyOf(primeValues, primeValues.length + 1);
				primeValues[primeValues.length - 1] = values[i];
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("Numero [" + (i+1) + "]: " + primeValues[i]);
		}
	}
	
	private static void add(int x, int y) {	
		int carry;
		
		while(y!=0) {
			carry = x & y ;
			x = x ^ y;
			y = carry << 1;
		}
		System.out.println("La suma es: "+x);
	}
	
	private static void palindrome(int x) {
		// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
		String value = String.valueOf(x);
		if(x<0) System.out.println("El numero no es valido");
		else if(value.length()<=2) System.out.println((value.charAt(0)==value.charAt(1))?"Es palindromo":"No es palindromo");
		else System.out.println("Numero mayor de dos cifras");
	}
	
	private static void addwLoops(int num) {
		// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
		int res = 0;
		String[] numString = Integer.toString(num).split("");
		int[] values = Arrays.stream(numString).mapToInt(Integer::parseInt).toArray();
		if(numString.length<=2) {
			res = values[0]+values[1];
		}
		else if(numString.length<=3) {
			res = values[0]+values[1]+values[2];
		}
		else if(numString.length<=4) {
			res = values[0]+values[1]+values[2]+values[3];
		}
		else if(numString.length<=5) {
			res = values[0]+values[1]+values[2]+values[3]+values[4];
		}
		else if(numString.length<=6) {
			res = values[0]+values[1]+values[2]+values[3]+values[4]+values[5];
		}
		else if(numString.length<=7) {
			res = values[0]+values[1]+values[2]+values[3]+values[4]+values[5]+values[6];
		}
		else if(numString.length<=8) {
			res = values[0]+values[1]+values[2]+values[3]+values[4]+values[5]+values[6]+values[7];
		}
		else if(numString.length<=9) {
			res = values[0]+values[1]+values[2]+values[3]+values[4]+values[5]+values[6]+values[7]+values[8];
		}
		
		System.out.println(res);
	}
	
	private static void emptySpace(String str) {
		// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
		String newStr = str.replaceAll(" ", "");
		System.out.println(newStr);
	}
	
	private static void invString(String str) {
		// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" ---Sin usar loops
		StringBuilder strBuilder = new StringBuilder(str);
		System.out.println(strBuilder.reverse());
	}
}