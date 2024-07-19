package aula19.exemploConstrutor;

public class Carro {
	String modelo;
	String montadora;
	String cor;
	int km;

	public Carro(){

	}
	public Carro(String modelo, String montadora){
		this.modelo = modelo;
		this.montadora = montadora;
	}
}
