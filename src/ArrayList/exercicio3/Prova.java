package ArrayList.exercicio3;

import java.util.HashSet;
import java.util.Set;

public class Prova {
    public static void main(String[] args) {
        //EX 3
        //Testando o metodo
        Set <Integer> listaSet = new HashSet<>();

        listaSet.add(1);
        listaSet.add(5);
        listaSet.add(5);
        listaSet.add(6);
        listaSet.add(7);
        listaSet.add(8);
        listaSet.add(8);
        listaSet.add(8);

        //chamando a função dentro do msm escopo
        somaTotal(listaSet);
    }


    //STATIC
    public static void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma = 0;
        for (Integer item : conjuntoDeInteiros){
            soma = soma + item;
        }
        System.out.println(soma);
    }
}
