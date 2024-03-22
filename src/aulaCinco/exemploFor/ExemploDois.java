package aulaCinco.exemploFor;

import java.util.Scanner;

public class ExemploDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		//Com While
		int cont = 0;
		int i = 0;
		while (i < 10) {
			System.out.print("Digite um número: ");
			int num = ler.nextInt();
			if (num > 10 && num < 20)
				cont++;
			i++;
		}
		System.out.println("Dos números digitados estão entre 10 e 20 " + cont);
		//Com for
		cont = 0;
		for (i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			int num = ler.nextInt();
			if (num > 10 && num < 20)
				cont++;
		}
		System.out.println("Dos números digitados estão entre 10 e 20 " + cont);
		//Com do..while
		cont = 0;
		i = 0;
		do {
			System.out.print("Digite um número: ");
			int num = ler.nextInt();
			if (num > 10 && num < 20)
				cont++;
			i++;
		}
		while (i < 10);
		System.out.println("Dos números digitados estão entre 10 e 20 " + cont);
	}
}
