package exercicios;

import util.TextoBundle;

public class Exercicio {

	/*
	 * O exercício será composto de diversas tarefas enumeradas em sequencia,
	 * conforme o disposto abaixo;
	 * 
	 * 1) Exiba no console a quantidade de caracteres que o valor da variável
	 * "texto" possui.
	 * 
	 * 2) Exiba no console uma lista que imprima todas as chaves e valores do
	 * ar- quivo .properties;
	 * 
	 * 3) Exiba no console a quantidade de vezes que a palavra "Java" aparece no
	 * conteúdo da chave "texto";
	 * 
	 * 4) Substitua todas as palavras "Java" no texto por "Oak" e imprima o
	 * texto na nova versão, na saída padrão do console.
	 */

	public static void main(String[] args) {

		TextoBundle bundle = new TextoBundle();
		String texto = bundle.retornaValor("texto");

		System.out.println("Ex01: " + texto.length() + "\n");

		// ----------------------------------------------------//

		String[] texto2 = bundle.retornaChavesDisponiveis();
		for (int i = 0; i < texto2.length; i++) {
			System.out.println("Ex02: " + texto2[i] + " = " + bundle.retornaValor(texto2[i]) + " caracteres.");
		}

		// ----------------------------------------------------//

		int contadorTextoChave = 0;
	       String[] textoArray = texto.split(" ");
	       for (int i = 0; i < textoArray.length; i++){
	    	   
	    	  if ((textoArray[i].toLowerCase().replaceAll("[^a-zA-Z]+", "").matches("^java$|^java"))) {
	    		  contadorTextoChave++;
	    	  };
	    	   

	       }
	      System.out.println("\nEx03: "+ contadorTextoChave + " palavras java\n");

		// ----------------------------------------------------//

		System.out.println("Ex04: " + texto.replace("Java", "Oak"));

	}

}
