package aula2;

import java.util.Scanner;

public class ExercicioGit5 {
	public static void main(String[] args) {
		Scanner scanln = new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor entre 1 e 10");
		valor = scanln.nextInt();
		if (valor>=1&valor<=10){
			System.out.println("\nTabuada de "+valor);
			for(int i=1;i<=10;i++)
				System.out.println(valor*i);
		}else
			System.out.println("Número Inválido");
	}
}
