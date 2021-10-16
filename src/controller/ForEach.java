package controller;

public class ForEach 
{
	static
	{
		System.out.println("\n\n\tFORs");
	}
	
	public void countFor(String sentence)
	{
		String[] phaseInSentence = sentence.split("");
		
		long inicio = System.nanoTime();
		for (int i=0; i<phaseInSentence.length; i++){}
		System.out.println("Tempo de Execução do LENGTH para "+phaseInSentence.length+": "+
			+(System.nanoTime() - inicio)+" nanos segundos.");
		
		long inicio2 = System.nanoTime();
		final int tamanho = phaseInSentence.length;
		for (int i=0; i<tamanho; i++){}
		System.out.println("Tempo de Execução do var com LENGTH para "+tamanho+": "+
			+(System.nanoTime() - inicio2)+" nanos segundos.");
		
		long inicio3 = System.nanoTime();
		for (String a : phaseInSentence){}
		System.out.println("Tempo de Execução do For each para "+phaseInSentence.length+": "+
			+(System.nanoTime() - inicio3)+" nanos segundos.");
	}
}