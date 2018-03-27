package aula1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos anos você tem?");
		int num = scanner.nextInt();
		
		//verifica a idade, >30=="Você é velho!"
		if(num>=30)
			System.out.println("You are Old!");
		else if(num<=15)
			System.out.println("Too Young...");
		else
			System.out.println("( ° ͜ ʖ °)");
	}

}
