package ArrayList.exercicio3;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {


        Set<Integer> listaSet = new HashSet<>();

        listaSet.add(1);
        listaSet.add(5);
        listaSet.add(5);
        listaSet.add(6);
        listaSet.add(7);
        listaSet.add(8);
        listaSet.add(8);
        listaSet.add(8);

        //Chamando a função fora do escopo
        Prova.somaTotal(listaSet);
    }
}
