package aula22.exemploFinal;

public class Exemplo1 {
	//Declarando uma variável do tipo FINAL
	final double numero;
	//Criando uma constante, ela DEVE receber um valor no momento da declaração
	//Acesso universal -> public
	//Existe independente da criação de instância -> static
	//Não pode ser modificada -> final
	public static final double PI = 3.141592653589793;

	//Como não foi definido um valor no momento da declaração, este valor
	// deverá ser atribuído até o final do construtor.
	public Exemplo1(){
		numero = 10;
	}
}
