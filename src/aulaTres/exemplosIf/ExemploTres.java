package aulaTres.exemplosIf;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite seu perfil: ");
		String perfil = ler.next();

		if(perfil.equals("admin")){
			System.out.println("Usuário administrador");
		}
		else if(perfil.equals("usuario")){
			System.out.println("Usuário normal");
		}
		else{
			System.out.println("Usuário visitante");
		}
	}
}
