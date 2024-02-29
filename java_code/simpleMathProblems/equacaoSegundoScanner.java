package br.com.fiap;

import java.util.Scanner;

public class equacaoSegundoScanner {
	public static void main(String[] args) {
		int a = 0 , b = 0 , c = 0;
		
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite os valores de A, B, C(nesta ordem): ");
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			System.out.println("O X1 é: " + ((-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a)));
			System.out.println("O X2 é: " + ((-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a)));
		} catch (Exception e) {
			System.out.println("Valor inválido");
		}
	}
}
