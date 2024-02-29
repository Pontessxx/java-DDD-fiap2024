package br.com.fiap;

import javax.swing.JOptionPane;

public class areaTrianguloJOP {
	public static void main(String[] args) {
		int base = 0 , altura = 0;
		
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite a base do triangulo: ");
			base = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a altura do triangulo: ");
			altura = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "A área do triangulo é: " + ((base * altura) / 2));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
		}
	}
}
