package aulaTres.exemplosCase;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite seu perfil: ");
		String perfil = ler.next();
		switch (perfil){
			case "admin"-> System.out.println("Usuário administrador");
			case "usuario"-> System.out.println("Usuário padrão");
			default -> System.out.println("Usuário visitante");
		}
	}
}
