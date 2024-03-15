package aulaTres.correcao;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe: ");
		System.out.print("Tamanho da pista em metros: ");
		float pista = ler.nextFloat()/1000;
		System.out.print("Número de voltas: ");
		int nVoltas = ler.nextInt();
		System.out.print("Abastecimentos: ");
		int abastecimentos = ler.nextInt();
		System.out.print("Autonomia: ");
		float autonomia = ler.nextFloat();
		float distancia = nVoltas*pista;
		float qLitros = distancia/autonomia;
		float litrosAbastecimento = qLitros/abastecimentos;
		System.out.printf("Serão necessários %.2f litros por abastecimento\n",litrosAbastecimento);
	}
}
