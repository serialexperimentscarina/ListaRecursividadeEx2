package view;

import javax.swing.JOptionPane;

import controller.MenorValorController;

public class Principal {

	public static void main(String[] args) {
		MenorValorController menorValorCont = new MenorValorController();
		int tamanho = 0;
		
		do {
			try {
				String input = JOptionPane.showInputDialog("Digite o tamanho do vetor: ", "");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrando");
					System.exit(0);
				}
				tamanho = Integer.parseInt(input);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Tamanho inválido");
				continue;
			}
			break;
		} while(true);
		
		int[] vet = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			do {
				try {
					String input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor do vetor: ", "");
					if (input == null) {
						JOptionPane.showMessageDialog(null, "Encerrando");
						System.exit(0);
					}
					vet[i] = Integer.parseInt(input);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Valor inválido");
					continue;
				}
				break;
			} while(true);
		}
		
		JOptionPane.showMessageDialog(null, "Menor valor do vetor: " + menorValorCont.menorValor(vet, tamanho, vet[tamanho - 1]));

	}

}
