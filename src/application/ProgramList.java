package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		
		System.out.println("\nLista � uma estrutura de dados\n"
				+ "\tHomog�nea, ordenada (acessar elementos por meio de posi��o).\n"
				+ "\tInicia vazia e seus elementos s�o colocados sob demanda.\n"
				+ "\tCada elemento ocupa um n� da lista.\n"
				+ "\tExemplo: Lista encadeada\n"
				+ "Vantagens\n"
				+ "\tTamanho vari�vel e facilidade para realizar Insert e Delete. (oposto de um vetor)\n"
				+ "Desvantagens\n"
				+ "\tAcesso sequencial aos elementos. Esse acesso � reduzido atrav�s da AraryList.(aposto do vetor)\n"
				+ "\tList n�o aceita tipos primitivos. Tem que usar a classe Wrapper.\n\n");
		
		List <String> lista = new ArrayList <String> ();
		lista.add("Rafael de Luca");
		lista.add("Robigol");
		lista.add("Jo�o da Silva");
		lista.add("Claudia");
		lista.add("Larissa Riquelme");
		lista.add("Formiga At�mica");
		lista.add("Maicon");
		
		//inserindo elemento na posicao 3. Usa a sobrecarga do m�todo add
		lista.add(3, "Maria Madalena");
		
		System.out.println("Tamanho da lista: " + lista.size());
		
		for (String nickname : lista) {
			System.out.println(nickname);
		}
		
		//removendo o 2 item da lista
		lista.remove(5);
		
		//removendo um objeto espec�fico da lista
		lista.remove("Claudia");
		
		//removendo usando um predicado. Todos que come�am com a letra r
		
		lista.removeIf(x -> x.charAt(0) == 'R' || x.charAt(0) == 'r');
		
		System.out.println("\nImprimindo a lista ap�s as remo��es.");
		for (String nickname : lista) {
			System.out.println(nickname);
		}
		
		System.out.println("\nIndex of Larissa: " + lista.indexOf("Larissa Riquelme"));
		System.out.println("Index of Ulisses: " + lista.indexOf("Ulisses"));
		
		//fazer retornas apenas o que est�o no filtro
		System.out.println("\nImprimindo apenas o que come�a com M");
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String apelido : resultado) {
			System.out.println(apelido);
		}
		
		
	}

}
