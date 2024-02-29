package br.com.fiap;

import javax.swing.JOptionPane;

public class areaTrapezioJOP {
	public static void main(String[] args) {
		int baseG = 0 , baseP = 0 , altura = 0;
		
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite a base maior: ");
			baseG = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a base menor: ");
			baseP = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a altura: ");
			altura = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "A área do trapézio é: " + (((baseG + baseP) * altura) / 2));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
		}
	}
}
