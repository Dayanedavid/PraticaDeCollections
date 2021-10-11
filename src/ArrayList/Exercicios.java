package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicios {

    public static void main(String[] args) {
        List <String> listaDeComandos = new ArrayList<>();

        listaDeComandos.add("ALPHA");
        listaDeComandos.add("BRAVO");
        listaDeComandos.add("DELTA");
        listaDeComandos.add("ECO");
        listaDeComandos.add("GOLF");
        listaDeComandos.add("HOTEL");
        listaDeComandos.add("INDIA");
        listaDeComandos.add("JULIET");
        listaDeComandos.add("MIKE");
        listaDeComandos.add("ZULU");
        listaDeComandos.add("X-RAY");
        listaDeComandos.add("TANGO");
        listaDeComandos.add("KILO");
        listaDeComandos.add("PAPA");
        listaDeComandos.add("SIERRA");

        for(String item : listaDeComandos){
            System.out.println(item);
        }

        listaDeComandos.remove(4);
        listaDeComandos.remove(10);
        listaDeComandos.remove(1);
        listaDeComandos.remove(2);
        listaDeComandos.remove(8);

        for(String item : listaDeComandos){
            System.out.println(item);
        }
    }
}