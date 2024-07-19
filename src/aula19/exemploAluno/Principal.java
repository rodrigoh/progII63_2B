package aula19.exemploAluno;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Aluno a1 = new Aluno();
		System.out.print("Nome: ");
		String nome = ler.next();
		System.out.print("Sobrenome: ");
		String sobrenome = ler.next();
		Aluno a1 = new Aluno(nome,sobrenome);
		System.out.print("E-mail: ");
		a1.eMail = ler.next();
		//a1.codigo = new Random().nextInt(1000,10000);
		System.out.println("Aluno "+a1.nome+"cadastrado com o código "+a1.codigo);
		System.out.print("Qual a primeira nota do "+a1.nome+": ");
		a1.n1 = ler.nextFloat();
		System.out.print("Qual a segunda nota do "+a1.nome+": ");
		a1.n2 = ler.nextFloat();
		System.out.print("O aluno "+a1.nome+" tem média "+a1.calculaMedia());
		System.out.println(" e está "+a1.obterStatus());

		Aluno a2 = new Aluno();
		a2.n1 = 8;

		Aluno a3 = new Aluno("Jonas");
		Aluno a4 = new Aluno("Ana","Silva");
	}
}
