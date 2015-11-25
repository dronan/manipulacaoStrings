package util;

import java.util.ResourceBundle;
import java.util.Set;

public class TextoBundle {

    ResourceBundle arquivoProperties = ResourceBundle.getBundle("assets.programacao");
    
    
    public String retornaValor(String chave) {
        String texto = arquivoProperties.getString(chave);
        return texto;
    }
    
    public String[] retornaChavesDisponiveis(){
        Set<String> keys = this.arquivoProperties.keySet();
        String [] array = keys.toArray(new String[0]);
        return array;
    }
    
   
}
