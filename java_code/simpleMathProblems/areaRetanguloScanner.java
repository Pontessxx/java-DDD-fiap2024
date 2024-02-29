package br.com.fiap;

import java.util.Scanner;

public class areaRetanguloScanner {
	public static void main(String[] args) {
		int lado1 = 0, lado2 = 0;
		
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite os lados do retangulo: ");
			lado1 = scan.nextInt();
			lado2 = scan.nextInt();
			System.out.println("Lado 1: " + lado1);
			System.out.println("Lado 2: " + lado2);
			System.out.println("A área do retangulo é: " + (lado1 * lado2));
			
		} catch (Exception e) {
			System.out.println("Valor inválido");
			System.out.println("Por favor digite um número inteiro");
		}

	}

}
