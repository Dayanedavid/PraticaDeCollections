package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class ExMap {
    public static void main(String[] args) {
        //  integer = chave
        // String = conteudo
        Map <Integer, String> map01 = new HashMap<>();

        //add por chave e valor
        map01.put(1, "placa de video");

        // consultar por chave
        String value= map01.get(3);

        //remover por chave
        map01.remove(5);

        //para percorrer os valores
        // necessita percorres todas as chaves (keys)
        for(Integer chaveDePesquisa: map01.keySet()){
            String valorDeOutput = map01.get(chaveDePesquisa);
            System.out.println(valorDeOutput);
        }
    }
}
