package ArrayList;

//imports necessarios
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;


public class ExHashMap {

    public static void main(String[] args) {

        //EXEMPLO1

        //criar a arrayList
        List<String> listaExemplo = new ArrayList<>();

        //add valores
        listaExemplo.add("A1");
        listaExemplo.add("B2");
        listaExemplo.add("C3");
        listaExemplo.add("D4");

        //remover por indice
        listaExemplo.remove(2);

        //consultar indice
        String valorDeColeta = listaExemplo.get(1);

        //para apresentar tds os calores cadastrados
        for (String valorBuscado:listaExemplo){
            System.out.println(valorBuscado);

        //EXEMPLO2

            List<String> listaDaLoja = new ArrayList<>();

            listaDaLoja.add("Laranja");
            listaDaLoja.add("Mamão");
            listaDaLoja.add("Biscoito");
            listaDaLoja.add("Pururuca seca");
            listaDaLoja.add("Pasta de dentes");

            listaDaLoja.remove(1);
            listaDaLoja.remove(3);

            for(String valorPesquisado : listaDaLoja){
                System.out.println(listaDaLoja);
            }
        }
    }
}
