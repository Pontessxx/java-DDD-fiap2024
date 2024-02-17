package br.com.fiap;

import java.util.Scanner;

public class anoeaniversario {

	public static void main(String[] args) {
		int anoNiver = 0, anoHoje=0;
		Scanner scan;
	
		// TODO Auto-generated method stub
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o Ano atual: ");
			anoNiver = scan.nextInt();
			System.out.println("Digite o Ano do seu aniversário: ");
			anoHoje = scan.nextInt();
			System.out.println("Sua idade é de : \t"+(anoNiver - anoHoje));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ano incorreto");
		}
	}

}
