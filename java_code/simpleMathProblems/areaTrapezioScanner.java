package br.com.fiap;

import java.util.Scanner;

public class areaTrapezioScanner {
	public static void main(String[] args) {
		int baseG = 0, baseP = 0, altura = 0;
		
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite a base maior, base menor e a altura nessa ordem: ");
			baseG = scan.nextInt();
			baseP = scan.nextInt();
			altura = scan.nextInt();
			System.out.println("Base maior: " + baseG);
			System.out.println("Base menor: " + baseP);
			System.out.println("Altura: " + altura);
			System.out.println("A área do trapézio é: " + ((baseG + baseP) * altura) / 2);
		} catch (Exception e) {
			System.out.println("Valor inválido");
		}
	}
}
