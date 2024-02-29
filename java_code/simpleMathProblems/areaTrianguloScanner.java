package br.com.fiap;

import java.util.Scanner;

public class areaTrianguloScanner {
	public static void main(String[] args) {
		int base = 0 , altura = 0;
		
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite as dimensões do triangulo (base primeiro): ");
			base = scan.nextInt();
			altura = scan.nextInt();
			System.out.println("A base é: " + base);
			System.out.println("A altura é: " + altura);
			System.out.println("A área do triangulo é: " + ((base * altura)/ 2));
		} catch (Exception e) {
			System.out.println("Valor inválido");
		}
	}
}
