package aulaSete.correcao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[] nomes = {"Ana", "João", "Carlos", "Bia", "Pedro", "Maria", "Rafael", "Sofia", "Igor", "Larissa"};
		System.out.print("Qual nome devo pesquisar na lista? ");
		String nome = ler.next();
		boolean achei = false;
		for(int i=0;i< nomes.length;i++){
			if(nomes[i].equalsIgnoreCase(nome)){
				achei = true;
			}
		}
		if(achei){
			System.out.println(nome+" está na lista");
		}
		else{
			System.out.println(nome+" não está na lista");
		}
	}
}
