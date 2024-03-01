package aulaDois.exemplos;

import java.util.Scanner;
public class ExemploUm {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um número: ");
		int numero = ler.nextInt();
		System.out.println("O número digitado foi: "+numero);
		System.out.printf("O número digitado foi %d\n",numero);

		System.out.print("Digite um número real: ");
		float numeroReal = ler.nextFloat();
		System.out.println("O número float é "+numeroReal);
		System.out.printf("O número float é %.2f\n",numeroReal);
	}
}
