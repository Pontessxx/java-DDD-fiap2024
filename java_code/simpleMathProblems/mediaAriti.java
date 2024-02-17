package br.com.fiap;

import java.util.Scanner;

public class mediaAriti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1 = 0f, n2 = 0f, n3=0f, n4 = 0f;
		
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite 4 notas: ");
			n1 = scan.nextInt();
			n2 = scan.nextInt();
			n3 = scan.nextInt();
			n4 = scan.nextInt();
			System.out.println("As notas foram : \t"+n1+"\t"+n2+"\t"+n3+"\t"+n4);
			System.out.println("A media aritimétrica é de : \t"+((n1+n2+n3+n4)/4));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Houve numeros incorretos ou há erros de digitação");
		}
	}

}
