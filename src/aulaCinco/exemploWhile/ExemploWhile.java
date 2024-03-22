package aulaCinco.exemploWhile;

import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		int cont = 0;
		while(cont<=10){
			System.out.print(cont+" ");
			cont++;
		}
		System.out.println("\nExemplo dois...");
		cont = 0;
		while(cont<=10)
			System.out.print((cont++)+" ");
	}
}
