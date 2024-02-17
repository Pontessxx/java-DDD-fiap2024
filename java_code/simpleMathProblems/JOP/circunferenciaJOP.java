package br.com.fiap;

import javax.swing.JOptionPane;

public class circunferenciaJOP {

	public static void main(String[] args) {
		float PI = 3.14f,r=0;
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite o valor do raio");
			r = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "O valor da area da circunferencia foi de "+(PI * (float) Math.pow(r, 2)));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro no tipo de variavel");
		}

	}

}
