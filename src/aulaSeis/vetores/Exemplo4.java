package aulaSeis.vetores;

import java.util.Scanner;

public class Exemplo4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamanho;
		do{
			System.out.print("Digite um valor entre 1 e 10: ");
			tamanho = ler.nextInt();
		}
		while (tamanho<1 || tamanho>10);
		int[] vetorA = new int[tamanho];
		int[] vetorB = new int[tamanho];
		int[] soma = new int[tamanho];
		System.out.println("Lendo dados para o vetor A");
		for(int i=0;i<tamanho;i++){
			System.out.print("vetor["+i+"]: ");
			vetorA[i] = ler.nextInt();
		}
		System.out.println("\nLendo dados para o vetor B");
		for(int i=0;i<tamanho;i++){
			System.out.print("vetor["+i+"]: ");
			vetorB[i] = ler.nextInt();
		}
		System.out.println("\nsomando e mostrando o vetor...");
		for(int i=0;i<tamanho;i++){
			soma[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorA[i]+" + "+ vetorB[i]+" = "+soma[i]);
		}
	}
}
