package br.com.fiap;

import java.util.Scanner;

public class circunferencia {
	public static void main(String[] args) {
		float PI = 3.14f, r = 0f,area = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("-- Circunferencia com Scanner--");
			System.out.println("Digite o valor do raio: ");
			r = scan.nextFloat();
			area = PI*(float) Math.pow(r, 2);
			System.out.println("O valor da area da circunferencia é de:"+area);
			
			
		} catch (Exception e) {
			System.out.println("Digitou o numero errado ou o tipo de variavel está incorreta");
		}
	}
}
