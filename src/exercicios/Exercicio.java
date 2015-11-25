package exercicios;

import util.TextoBundle;

public class Exercicio {

    /* O exercício será composto de diversas tarefas enumeradas em sequencia,
     * conforme o disposto abaixo;
     * 
     * 1) Exiba no console a quantidade de caracteres que o valor da variável 
     *    "texto" possui.
     * 
     * 2) Exiba no console uma lista que imprima todas as chaves e valores do ar-
     *    quivo .properties;
     * 
     * 3) Exiba no console a quantidade de vezes que a palavra "Java" aparece
     *    no conteúdo da chave "texto";
     * 
     * 4) Substitua todas as palavras "Java" no texto por "Oak" e imprima o
     *    texto na nova versão, na saída padrão do console.
     */
    
    public static void main(String [] args ) {
       
       TextoBundle bundle = new TextoBundle();
       String texto = bundle.retornaValor("texto");
                     
       System.out.println("Ex01: " + texto.length() + "\n");
       
       //----------------------------------------------------//
              
       String[] texto2 = bundle.retornaChavesDisponiveis();
       for (int i = 0; i < texto2.length; i++) {
    	   System.out.println("Ex02: " + texto2[i] + " = " + bundle.retornaValor(texto2[i]) + " caracteres." );
       }
       
       //----------------------------------------------------//
      
       System.out.println();
       // texto separado em um array
       String[] textoArray = texto.split(" ");
       // palavra a ser procurada
       String textoChave = "java";
       int contadorTextoChave = 0;
       for (int i = 0; i < textoArray.length; i++){
    	
    	// garanto palavras maiores que 4, para evitar erro no substring, e pego as palavras que começam com "j"
		if ((textoArray[i].toLowerCase().length() >= 4) && (textoArray[i].toLowerCase().indexOf('j') == 0)) {
			
			// filtro as palavras e comparo com a chave passada
			if (textoArray[i].toLowerCase().substring(0,4).equals(textoChave)) {
				contadorTextoChave++;
			}
			
		}

       }
       System.out.println("Ex03: "+ contadorTextoChave + " palavras " + textoChave + "\n");

       //----------------------------------------------------//
       
       System.out.println("Ex04: "+ texto.replace("Java", "Oak"));

              
    }
    
}
