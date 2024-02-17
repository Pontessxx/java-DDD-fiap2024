package br.com.fiap;

import javax.swing.JOptionPane;

public class primeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 0; 
		String aux;	

		try {
			aux = JOptionPane.showInputDialog("Digite o primeiro numeor inteiro");
			x = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o segundo numeor inteiro");
			y = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "Valor 1: \t"+x+"\nValor 2: \t"+y+"\n\nResultado: \t"+(x+y));
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showInputDialog("Formato incorreto do número!");
		}
		
	}

}
