package Suma;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		int valor1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca un número entero");
		int valor2 = Integer.parseInt(sc.nextLine());
		System.out.println("La suma de los dos números es: " + (valor1 + valor2));
		sc.close();

	}

}
