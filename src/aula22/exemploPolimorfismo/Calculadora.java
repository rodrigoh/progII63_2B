package aula22.exemploPolimorfismo;

public class Calculadora {
	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		System.out.println("Somando dois número: "+op.soma(5,6));
		System.out.println("Somando três números: "+op.soma(6,7,1));
		System.out.println("Somando duas Strings: "+op.soma("Palavra","casa"));
	}
}
