package view;

import javax.swing.JOptionPane;
import controller.ConcatCount;
import controller.ForEach;

public class Principal 
{
	public static void main(String[] args) 
	{
		ConcatCount cc = new ConcatCount();
		
		Integer quantidadeContagem = Integer.parseInt(
			JOptionPane.showInputDialog("D�gite a quantidade de cria��es de arrays de chars: "));
		
		cc.countString(quantidadeContagem);
		cc.countBuffer(quantidadeContagem);
		
		ForEach fe = new ForEach();
		fe.countFor("Ol� o meu nome � Ryan!");
	}
}