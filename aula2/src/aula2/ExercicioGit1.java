package aula2;

import java.util.Scanner;

public class ExercicioGit1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float fahr; float celsius;
		System.out.println("Digite valor em Fahrenheit: ");
		fahr = scanner.nextFloat();
		celsius = 5*(fahr-32)/9;
		System.out.println("Temp. em Celsius: "+celsius);
	}
}
