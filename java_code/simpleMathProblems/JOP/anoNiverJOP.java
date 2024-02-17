package br.com.fiap;

import javax.swing.JOptionPane;

public class anoNiverJOP {
	public static void main(String[] args) {
		int anoNiver = 0, anoHoje=0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o ano atual ");
			anoHoje = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o ano de aniversário ");
			anoNiver = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "Sua idade é de: \t"+(anoHoje - anoNiver));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
