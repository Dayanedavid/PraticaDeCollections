package ArrayList;

import java.util.*;

public class ExPGDicionario {
    public static void main(String[] args) {

        //EX1
        Map <Integer,String> loteriaDosSonhos = new HashMap<>();

        loteriaDosSonhos.put(0,"Ovos");
        loteriaDosSonhos.put(1,"Água");
        loteriaDosSonhos.put(2,"Escopeta");
        loteriaDosSonhos.put(3,"Cavalo");
        loteriaDosSonhos.put(4,"Dentista");
        loteriaDosSonhos.put(5,"Fogo");

        loteriaDosSonhos.forEach((Chave, Conteudo) -> System.out.println("Chave: "+ Chave +" " + "Conteudo: " + Conteudo));

        Map <String,String> listaDeApelidos = new HashMap<>();

        listaDeApelidos.put("Joâo","Juan, Fissura, Maromba");
        listaDeApelidos.put("Miguel","Night Watch, Bruce Wayne, Tampinha");
        listaDeApelidos.put("Maria","Wonder Woman, Mary, Marilene");
        listaDeApelidos.put("Lucas","Lukinha, Jorge, George");

        for(String chave: listaDeApelidos.keySet()){
            String valor = listaDeApelidos.get(chave);
            System.out.println(valor);
        }

//        EX 2

//        LISTA VAZIA
        List <Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);

        for(Integer item : lista){
            System.out.println("Item lista: "+item);
        }

//        CONJUNTO VAZIO
        Set <Integer> listaSet = new HashSet<>();

        listaSet.add(1);
        listaSet.add(5);
        listaSet.add(5);
        listaSet.add(6);
        listaSet.add(7);
        listaSet.add(8);
        listaSet.add(8);
        listaSet.add(8);

        listaSet.forEach(System.out::println);


    }
}
