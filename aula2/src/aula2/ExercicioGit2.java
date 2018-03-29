package aula2;

import java.util.Scanner;

public class ExercicioGit2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b; double c, form1, form2, form3;
		System.out.println("Escreva dois números inteiros e um número real respectivamente:");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextDouble();
		//O produto do dobro de "a" com a metade de "b"
		form1 = (2*a)*(b/2);
		//A soma do triplo de "a" com "c"
		form2 = (3*a)+c;
		//"c" elevado ao cubo
		form3 = (c*c*c);
		System.out.println("Resultado 1: "+form1+"\nResultado 2: "+form2+"\nResultado 3: "+form3);
					}
}
