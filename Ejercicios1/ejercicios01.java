package practica1;

import java.time.LocalDateTime;

public class Practica {
	public static void main(String[] args) {		
		System.out.println("El area del triangulo es: " + triangleArea(3.0f, 4.0f, 5.0f));
		System.out.println(circle(4.0f));
		System.out.println("La hora actual es: " +systemTime());
		System.out.println(segConvert(3668.0f));
		System.out.println("El volumen de la esfera es de: "+sphereVolume(5.0));
		System.out.println("El volumen del cono es de: " + coneVolume(8.0, 18.0));
		System.out.println("El area superficial es de: "+ surfAreaCube(5));
		System.out.println(leapYear(2012));
	}
	
	//********************** Metodos ****************************//
	private static float triangleArea(float a, float b, float c) {
		// 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
		// Revisar si es un triángulo válido
		float area = 0;
		float sp = 0;
		
		// Verificamos si es un triangulo valido
		if((a+c>b)&&(a+b>c)&&(b+c>a)) { 
			System.out.println("Si es un triangulo valido");
			sp = (a+b+c)/2;
			area = (float) Math.sqrt(sp*(sp-a)+sp*(sp-b)+sp*(sp-c));
		}
		else {
			System.out.println("No es un triangulo valido");
		}
		return area;
	}
	
	private static String circle(float r) {
		// 2 Escribir un metodo para encontrar el area y la circunferencia de un circulo dado el radio
		// Utilizar PI de la libreria de Java
		float area = 0, cir = 0;
		
		// Calculamos el area
		area = (float) (Math.PI *Math.pow(r, 2));
		
		// Calculamos el perimetro
		cir = (float) (Math.PI*2*r);
		
		// Resultado
		String result = "El area del circulo es: " + Float.toString(area) + " y la circunferencia es: "+Float.toString(cir);
		return result;
	}
	
	private static int systemTime() {
		// 3 Escribir un metodo que muestre por consola la hora del sistema
		// Utilizar e investigar la libreria de Java
		int hour = LocalDateTime.now().getHour();
		return hour;
	}
	
	private static String segConvert(float seg) {
		// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
		// ej 3600 = "1 hora = 60 min = 3600 seg"
		float hour = 0, min = 0;
		if(seg%3600 == 0) hour = seg/3600;
		else if(seg%3600 != 0){
			hour = Math.round(seg/3600);
			if((seg/60) - (hour*60) != 0) {
				min = Math.round((seg/60) - (hour*60));
				seg+= -hour*3600 - min*60;
			}
		}
		else System.out.println("El numero no es valido");
		
		String timeConvert = Float.toString(hour) + " hr " + Float.toString(min) + " min " + Float.toString(seg)
				+ " seg = " + Float.toString(hour * 60 + min) + " min " + Float.toString(seg) + " seg = "
				+ Float.toString(hour * 3600 + min * 60 + seg) + " seg";
		return timeConvert;
	}
	
	private static double sphereVolume(double r) {
		// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
		// Se calcula el volumen
		double volume = (4.0/3.0)*(Math.PI)*(Math.pow(r, 3));
		return Math.round(volume*100.0)/100.0;
	}
	
	private static double coneVolume(double r, double h) {
		// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
		double volume = (Math.PI)*(Math.pow(r, 2)*h)/3.0;
		return Math.round(volume*100.0)/100.0;
	}
	
	private static double surfAreaCube(double a) {
		// 7 Encontrar el area superficial de un cubo dado un lado a
		double area = 6*Math.pow(a, 2);
		return Math.round(area*100.0)/100.0;
	}
	
	private static String leapYear(int year){
		// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
		String leapYear = "";
		if(year % 4 == 0) {
			leapYear = "Ano bisiesto";
		}
		else {
			leapYear = "No es ano bisiesto";
		}
		return leapYear;
	}
}
