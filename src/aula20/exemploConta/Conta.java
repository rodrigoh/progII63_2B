package aula20.exemploConta;

import java.util.Random;

public class Conta {
	String titular;
	String identificador;
	float saldo;
	String senha;
	//Criando um atributo estático
	static String nomeBanco;

	public Conta(String titular, float saldo){
		this.titular = titular;
		this.saldo = saldo;
		geraIdentificador();
	}

	boolean sacar(float valor){
		if(valor<=saldo){
			saldo-=valor;
			return true;
		}
		return false;
	}

	void depositar(float valor){
		saldo+=valor;
	}

	void geraIdentificador(){
		String identificador = "";
		Random aleatorio = new Random();
		for(int i=0;i<4;i++){
			identificador+=(char)aleatorio.nextInt(65,90);
		}
		identificador+=aleatorio.nextInt(1000,2000);
		this.identificador = identificador;
	}

	String verificaSaldo(){
		return String.format("Seu saldo é de R$%.2f",saldo);
	}

	public boolean validaAcesso(String identificador, String senha){
		return this.identificador.equals(identificador) && this.senha.equals(senha);
	}
}
