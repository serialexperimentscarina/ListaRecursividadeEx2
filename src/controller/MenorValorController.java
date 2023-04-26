package controller;

public class MenorValorController {

	public MenorValorController() {
		super();
	}
	
	public int menorValor(int[] vet, int tamanho, int menor) {
		// Condição de parada: Quando tamanho for menor ou igual a 0, todo vetor já terá sido percorrido, o atual menor valor é o menor valor do vetor
		if (tamanho <= 0) {
			return menor;
		}
		if (vet[tamanho - 1] < menor) {
			menor = vet[tamanho - 1];
		}
		// Relação de chamada dos passos: Checar o se o valor em (tamanho - 1 = último valor do vetor na primeira iteração) é menor que o atual menor valor, chamar a função recursivamente com tamanho decrementado por 1, com isso percorreremos todo o vetor na busca do menor valor.
		return menorValor(vet, (tamanho - 1), menor);
	}

}
