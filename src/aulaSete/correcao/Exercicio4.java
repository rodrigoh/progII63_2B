package aulaSete.correcao;

import java.util.Random;
import java.util.Scanner;

/*
Ler um vetor A de 10 elementos inteiros e um valor X também inteiro.
Armazenar em um vetor M o resultado de cada elemento de A multiplicado
pelo valor X. Logo após, imprimir o vetor M.
 */
public class Exercicio4 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		int[] vetorM = new int[10];
		System.out.println("Dados no vetor...");
		for(int i=0;i<vetor.length;i++){
			vetor[i] = aleatorio.nextInt(1,20);
			System.out.print(vetor[i]+" ");
		}
		System.out.print("\nDigite um valor para multiplicar o vetor: ");
		int x = ler.nextInt();
		System.out.println("Vetor multiplicado");
		for(int i=0;i< vetorM.length;i++){
			vetorM[i] = vetor[i]*x;
			System.out.print(vetorM[i]+" ");
		}
	}
}
