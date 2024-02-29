package br.com.fiap;

import javax.swing.JOptionPane;

public class areaRetanguloJOP {
	 public static void main(String[] args) {
		int lado1 = 0 , lado2 = 0;
		
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite o lado 1: ");
			lado1 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o lado 2: ");
			lado2 = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "A área do triangulo é: " + (lado1 * lado2));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
		}
	}
}
