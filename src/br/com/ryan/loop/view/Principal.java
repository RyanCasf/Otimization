package br.com.ryan.loop.view;

import javax.swing.JOptionPane;

import br.com.ryan.loop.ConcatCount;
import br.com.ryan.loop.ForEach;

public class Principal {
	public static void main(String[] args) {
		ConcatCount cc = new ConcatCount();

		Integer quantidadeContagem = Integer
				.parseInt(JOptionPane.showInputDialog("Dígite a quantidade de criações de Arrays de Chars: "));

		cc.countString(quantidadeContagem);
		cc.countBuffer(quantidadeContagem);

		ForEach fe = new ForEach();
		fe.countFor(JOptionPane.showInputDialog("Dígite um texto para comparação de Fors: "));
	}
}