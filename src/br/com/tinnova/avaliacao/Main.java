package br.com.tinnova.avaliacao;

import java.util.Arrays;

import br.com.tinnova.avaliacao.util.BubbleSort;

public class Main {

	public static void main(String[] args) {
		int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};
		System.out.println("Vetor Original: " + Arrays.toString(vetor));
		System.out.println("Vetor Ordenado: " + Arrays.toString(BubbleSort.ordenar(vetor)));
	}

}
