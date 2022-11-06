package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\nVetor: Arranjos unidimensionais\n"
				+ "Estrutura de dados\n"
				+ "Homonênea, Ornedada, alocoda de uma vez só em um bloco contíguo de memória.\n"
				+ "Vantagens: Acesso imediato aos elementos pela posição deles.\n"
				+ "Desvantagens: Tamanho fixo e dificuldades para fazer insert e delete.\n"
				+ "");
		
		Locale.setDefault(Locale.US);
		
		Scanner input= new Scanner (System.in);
		
		int tamanho = 5;
		int tamanhoPeso = 3;
		double [] vetorAlturas = new double [tamanho];
		vetorAlturas[0] = 1.50;
		vetorAlturas[1] = 1.65;
		vetorAlturas[2] = 1.77;
		vetorAlturas[3] = 1.81;
		vetorAlturas[4] = 1.64;
		
		double [] vetorPeso = new double [tamanhoPeso];
		System.out.print("Informe as 3 valores de peso separados por expaço: ");
		for(int i =0; i < vetorPeso.length ; i++) {
			vetorPeso[i] = input.nextDouble();
		}
		
		System.out.println("\nVetor de alturas");
		for(int i=0 ; i < vetorAlturas.length ; i++) {
			System.out.println("Valor da altura na posicao " + i + " é " + String.format("%.2f", vetorAlturas[i]));
		}
		
		System.out.println("Média das alturas: " + String.format("%.2f", media(vetorAlturas)));
		
		System.out.println("\nVetor de Pesos");
		for(int i=0 ; i < vetorPeso.length ; i++) {
			System.out.println("Valor da peso na posicao " + i + " é " + String.format("%.2f", vetorPeso[i]));
		}
		
		System.out.println("Média dos Pesos: " + String.format("%.2f", media(vetorPeso)));
		
		
		
		
		input.close();
 
	}
	
	public static double media (double [] vetor) {
		double soma =0.0;
		for (int i=0 ; i < vetor.length ; i++) {
			soma += vetor[i];
		}
		double media = soma /vetor.length;
		return media;
	}

}
