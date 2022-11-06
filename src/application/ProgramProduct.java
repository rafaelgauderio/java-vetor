package application;

import entities.Produto;

public class ProgramProduct {

	public static void main(String[] args) {
		
	int size = 3;
	
	Produto p1 = new Produto ("T�nnis" ,350.50);
	Produto p2 = new Produto ("Cal�a" ,280.50);
	Produto p3 = new Produto ();
	p3.setName("Cinto Preto");
	p3.setPrice(60.99);
	
	Produto [] vetorProdutos = new Produto [size];
	
	vetorProdutos[0] = p1;
	vetorProdutos[1] = p2;
	vetorProdutos[2] = p3;
	
	
	System.out.println("\nImprimindo o vetor, vai imrimir um refer�ncia de mem�ria");
	System.out.println(vetorProdutos);
	System.out.println("\nImprimindo itens do vetor");
	for(int i=0; i < vetorProdutos.length; i++) {
		System.out.println(vetorProdutos[i]);
	}
	
	System.out.println("\nM�dia dos pre�os: " + String.format("R$ %.2f",precoMedio(vetorProdutos)));
	

	}
	
	public static double precoMedio(Produto [] vetor) {
		double soma =0.0;
		for(int i=0; i <vetor.length; i++) {
			soma += vetor[i].getPrice();
		}
		
		double media = soma / vetor.length;
		return media;
		
	}

}
