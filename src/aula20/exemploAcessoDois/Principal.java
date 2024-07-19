package aula20.exemploAcessoDois;

import aula20.exemploAcesso.Pessoa;

public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		//O nome está sem modificador na classe Pessoa, desta forma a classe
		// Principal não tem acesso a ele;
		//p1.nome = "Jonas";
	}
}
