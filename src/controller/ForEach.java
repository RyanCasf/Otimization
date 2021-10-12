package controller;

public class ForEach 
{
	public void countFor(String sentence)
	{
		String[] phaseInSentence = sentence.split("");
		
		long inicio = System.nanoTime();
		for (int i=0; i<phaseInSentence.length; i++)
		{
			// System.out.println(phaseInSentence[i]);
		}
		System.out.println(System.nanoTime() - inicio);
		
		long inicio2 = System.nanoTime();
		final int tamanho = phaseInSentence.length;
		for (int i=0; i<tamanho; i++)
		{
			// System.out.println(phaseInSentence[i]);
		}
		System.out.println(System.nanoTime() - inicio2);
		
		long inicio3 = System.nanoTime();
		for (String a : phaseInSentence)
		{
			// System.out.println(a);
		}
		System.out.println(System.nanoTime() - inicio3);
	}
}