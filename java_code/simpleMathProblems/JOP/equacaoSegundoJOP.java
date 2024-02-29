package br.com.fiap;

import javax.swing.JOptionPane;

public class equacaoSegundoJOP {
	public static void main(String[] args) {
		int a = 0 , b = 0 , c = 0;
		
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite o valor de A: ");
			a = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o valor de B: ");
			b = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o valor de C: ");
			c = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "O X1 é: " + ((-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a)) + "\nO X2 é: " + ((-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a)));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
		}
	}
}
