package aulaCinco.exemploDoWhile;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		int nota;
		do{
			System.out.print("Digite a nota: ");
			nota = new Scanner(System.in).nextInt();
		}
		while(nota<0 || nota>10);
	}
}
