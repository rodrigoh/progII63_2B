package aulaCinco.exemploDoWhile;

public class ExemploDois {
	public static void main(String[] args) {
		int cont=10;
		while(cont<10){
			System.out.print(cont+" ");
			cont++;
		}
		do{
			System.out.print(cont+" ");
			cont++;
		}
		while (cont<10);
	}
}
