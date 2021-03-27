package br.com.tinnova.avaliacao.util;

public class BubbleSort {
	
	public static int[] ordenar(int[] vetor) {
		
		if (vetor.length > 1) {
			int totalIteracoes = vetor.length - 1;
			int iteracoesExecutadas = 0;
			
			while (iteracoesExecutadas < totalIteracoes) {
				int ultimoIndiceDesordenado = totalIteracoes - iteracoesExecutadas;			
				
				for (int i = 0; i < ultimoIndiceDesordenado; i++) {
					if (vetor[i] > vetor[i+1]) {
						int aux = vetor[i];
						vetor[i] = vetor[i+1];
						vetor[i+1] = aux;
					}
				}
				
				iteracoesExecutadas++;
			} 
		}
		
		return vetor;
	}
}
