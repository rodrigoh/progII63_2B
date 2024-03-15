package aulaQuatro.correcao;

import java.util.Scanner;

/*Crie um algoritmo que pergunte ao usuário se ele deseja
converter uma temperatura de graus Celsius em graus
Fahrenheit ou Fahrenheit em Celsius. Em seguida mostre
na tela o valor final correspondente à opção escolhida
pelo usuário. F = 1.8 * C + 32 | C = (F – 32) / 1.8;
 */
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite f para converter uma temperatura de °F para °C");
		System.out.print("Digite c para converter uma temperatura de °C para °F: ");
		char opc = ler.next().toLowerCase().charAt(0);
		switch (opc){
			case 'f'->{
				System.out.print("Informe uma temperatura em °F: ");
				float tempF = ler.nextFloat();
				float tempC = (tempF - 32) / (float)1.8;
				System.out.printf("%.2f°F equivale(m) a %.2f°C\n",tempF,tempC);
			}
			case 'c'->{
				System.out.print("Informe uma temperatura em °C: ");
				float tempC = ler.nextFloat();
				float tempF = (float)1.8 * tempC + 32;
				System.out.printf("%.2f°C equivale(m) a %.2f°F\n",tempC,tempF);
			}
			default -> System.out.println("Opção inválida");
		}
	}
}
