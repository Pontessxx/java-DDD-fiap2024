package br.com.fiap;
import java.util.Scanner;

public class primeiro {

	public static void main(String[] args) {
		int x = 0, y = 0; 
		Scanner scan;	

		try {
			scan = new Scanner(System.in);
			System.out.println("Digite 2 numeros inteiros");
			x = scan.nextInt();
			y = scan.nextInt();
			System.out.println("Valor 1: \t" + x + "\nValor 2: \t" + y);
			System.out.println("Somas dos Valores: \t" + (x + y));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Formato incorreto do número!");
		}
		
	}

}
