package Algoritmo78_CalculoLadosDoPoligon0;

import java.util.Scanner;

public class Algoritmo78_CalculoLadosDoPoligono {

	static int n;
	
	public static void main(String[] args) {
		
		algoritmo78_CalculoLadosDoPoligono(n);

	}

	public static void algoritmo78_CalculoLadosDoPoligono(int n) {
		double nd;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o n�mero de lados do pol�gono");
		n = scanner.nextInt();
		nd = n*(n-3)/2;
		
		System.out.println("N�mero de diagonais: " + nd);
	}

}
