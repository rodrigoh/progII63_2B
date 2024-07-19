package aula19.exemploAluno;

import java.util.Random;

public class Aluno {
	String nome;
	String sobrenome;
	String eMail;
	int codigo;
	float n1;
	float n2;

	public Aluno(){
		codigo = new Random().nextInt(1000,10000);
	}
	public Aluno(String nome){
		this.nome = nome;
		codigo = new Random().nextInt(1000,10000);
	}
	public Aluno(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
		codigo = new Random().nextInt(1000,10000);
	}

	void alterarNome(String nome){
		this.nome = nome;
	}

	float calculaMedia(){
		return (n1+n2)/2;
	}

	String obterStatus(){
		float media = calculaMedia();
		if(media>=8)
			return "aprovado";
		else if(media>=6)
			return "recuperação";
		else
			return "reprovado";
	}
}
