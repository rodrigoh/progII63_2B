package aulaQuatro.correcao;
/*A jornada de trabalho semanal de um funcionário é de
40 horas. O funcionário que trabalhar mais de 40 horas
receberá hora extra, cujo cálculo é o valor da hora regular
com um acréscimo de 50%. Escreva um algoritmo que leia o
número de horas trabalhadas em um mês, o salário por hora
e escreva o salário total do funcionário, que deverá ser
acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas).
 */

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantas horas foram trabalhadas: ");
		float horas = ler.nextFloat();
		System.out.print("Qual o valor da hora: ");
		float valorHora = ler.nextFloat();
		float salarioBase = 160*valorHora;
		if(horas>160){
			float salarioExtra = (horas-160)*(valorHora*(float)1.5);
			System.out.printf("Seu salário será de R$%.2f\n",salarioBase);
			System.out.printf("Acrescidas as horas extras no valor de R$%.2f\n",salarioExtra);
			System.out.printf("Resulta em um total de R$ %.2f\n",salarioBase+salarioExtra);
		}
		else{
			System.out.printf("Seu salário será de R$%.2f\n",salarioBase);
		}
	}
}
