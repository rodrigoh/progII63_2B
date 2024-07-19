package aulaSeis.vetores;

import java.util.Scanner;

public class Exemplo6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[100];
		int cont=0;
		int num;
		do{
			System.out.print("Digite um número 0 para encerrar: ");
			num = ler.nextInt();
			if(num>0){
				vetor[cont]=num;
				cont++;
			}
		}
		while (num>0 && cont<100);
		for(int i=0;i<cont;i++){
			System.out.print(vetor[i]+" ");
		}
	}
}
