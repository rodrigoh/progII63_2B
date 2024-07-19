package aulaSete.correcao;

import java.util.Random;
import java.util.Scanner;

/*
Ler um vetor de 10 elementos inteiros. Após isto, imprimir na tela os 10 valores
lidos e o usuário poderá escolher um destes valores para ser excluído do vetor.
Ler o valor escolhido e eliminá-lo do vetor. No momento da exclusão todos os
valores posteriores ao valor escolhido deverão ser reorganizados
(movidos uma posição para esquerda) a fim de que o vetor resultante
não fique com um espaço em branco. Imprimir o novo vetor.
 */
public class Exercicio11 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetor = new int[10];
		for(int i=0;i< vetor.length;i++){
			vetor[i] = aleatorio.nextInt(50);
			System.out.print(vetor[i]+" ");
		}
		System.out.print("\nQual número deseja remover da lista: ");
		int remove = new Scanner(System.in).nextInt();
		//Busca pelo número no vetor
		int posicao = -1;
		for(int i=0;i<vetor.length;i++){
			if(vetor[i]==remove){
				posicao = i;
			}
		}
		//System.out.println("O elemento a ser removido está na posição "+posicao);
		//Removendo o número da lista
		for(int i=posicao;i<vetor.length-1;i++){
			vetor[i] = vetor[i+1];
		}
		System.out.println("\nDados no vetor");
		for(int i=0;i<vetor.length-1;i++){
			System.out.print(vetor[i]+" ");
		}
	}
}
