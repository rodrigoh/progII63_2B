package aulaCinco.exemploFor;

public class Exemplo {
	public static void main(String[] args) {
		System.out.println("Exemplo um: ");
		for(int i=0;i<=10;i++){
			System.out.print(i+" ");
		}
		System.out.println("Exemplo dois: ");
		//for(inicialização; teste; passo)
		for(int i=0,j=9;i<10 && j>=0;i++,j--){
			System.out.println("i = "+i+", j = "+j);
		}
	}
}
