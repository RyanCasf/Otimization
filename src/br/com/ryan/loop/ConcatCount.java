package br.com.ryan.loop;

public class ConcatCount {
	static {
		System.out.println("\n\tCRIAÇÃO");
	}

	public void countString(int quantidade) {
		double inicio = System.nanoTime();
		
		for (int i = 0; i < quantidade; i++) {
			String a = "A";
		}

		exibirQuantidade(quantidade, inicio, "String");
	}

	public void countBuffer(int quantidade) {
		double inicio = System.nanoTime();

		for (int i = 0; i < quantidade; i++) {
			StringBuffer buffer = new StringBuffer("A");
		}

		exibirQuantidade(quantidade, inicio, "Buffer");
	}

	private void exibirQuantidade(int quantidade, double inicio, String nome) {
		if (quantidade < 1000) {
			System.out.println(
					"Criar " + quantidade + " " + nome + " levou " + (System.nanoTime() - inicio) + " nano segundos.");
		} else {
			System.out.println("Criar " + quantidade + " " + nome + " levou "
					+ (System.nanoTime() - inicio) / 1000000000 + " segundos.");
		}
	}
}