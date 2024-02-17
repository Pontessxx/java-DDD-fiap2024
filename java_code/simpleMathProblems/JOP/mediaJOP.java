package br.com.fiap;

import javax.swing.JOptionPane;

public class mediaJOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1 = 0f, n2 = 0f, n3=0f, n4 = 0f;
		String aux;
		aux = JOptionPane.showInputDialog("Digite as 4 notas do aluno:");
		n1 = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Nota 2:");
		n2 = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Nota 3:");
		n3 = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Nota 4:");
		n4 = Integer.parseInt(aux);
		JOptionPane.showMessageDialog(null,"A media aritimétrica é de : \t"+((n1+n2+n3+n4)/4));
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,"Formato de numero errado");
		}
	}

}
