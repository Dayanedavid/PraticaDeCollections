package ArrayList;
import java.util.Set;
import java.util.HashSet;

public class ExHashSet {
    // Exercício 02 (Exercise 02) - Agora é com vocês, Mestres.

        // Para comunicação dos soldados na base naval, alguns comandos ainda estão faltando.
        // Crie uma lista de comunicação do tipo arrayList e adicione mais 15 itens a esta lista para completar a fase 01 de comunicação.
        // Sugestões de itens a serem adicionados:
        //A – ALPHA        J – JULIET     S – SIERRA
        //B – BRAVO        K – KILO       T – TANGO
        //C – CHARLIE  L – LIMA       U – UNIFORM
        //D – DELTA        M – MIKE       V – VICTOR
        //E – ECO      N – NOVEMBER   W – WHISKEY
        //F – FOXTROT  O – OSCAR      X – X-RAY
        //G – GOLF     P – PAPA       Y – YANKEE
        //H – HOTEL        Q – QUEBEC     Z – ZULU
        //I – INDIA        R – ROMEU

        // Observação: Não podemos adicionar comandos repetidos.
        // Para completar o nível 02 de comunicação, crie uma forma de apresentar
        // todos os itens enviados ao vetor de comunicação (ArrayList).

        // Por final, para chegarmos a conclusão da comunicação,
        // remova 05 comandos do vetor de comunicação e reapresente o vetor
        // com estes itens removidos.

        // Se tudo ocorrer como planejado, a missão estará cumprida em 100%

    public static void main(String[] args) {

        Set <String> listaDeDoacao = new HashSet<>();

        listaDeDoacao.add("Macarrão");
        listaDeDoacao.add("Arroz");
        listaDeDoacao.add("banana");
        listaDeDoacao.add("maça");
        listaDeDoacao.add("uva");

        listaDeDoacao.add("calças");
        listaDeDoacao.add("blusa");
        listaDeDoacao.add("shorts");
        listaDeDoacao.add("tenis");
        listaDeDoacao.add("Meia");

        listaDeDoacao.remove("Jaqueta");

        listaDeDoacao.remove("Macarrão");

        for( String valorRemovido : listaDeDoacao){
            System.out.println(valorRemovido);
        }

        Set <String> listaDeDoacaos = new HashSet<>();

        listaDeDoacaos.add("Cimento");
        listaDeDoacaos.add("Argamassa");
        listaDeDoacaos.add("Caibros");
        listaDeDoacaos.add("Cal");
        listaDeDoacaos.add("Pedras");
        listaDeDoacaos.add("Caminhão de água");
        listaDeDoacaos.add("Betoneira");
        listaDeDoacaos.add("Serviço de obras A - Arquiteto");
        listaDeDoacaos.add("Serviço de obras B - Chefe de obras");
        listaDeDoacaos.add("Serviço de obras C - Pedreiro");

        listaDeDoacaos.remove("Serviço de obras A - Arquiteto");
        listaDeDoacaos.remove("Argamassa");
        listaDeDoacaos.remove("Caminhão de água");

        for( String itemsDoacao : listaDeDoacaos){
            System.out.println(itemsDoacao);
        }



    }
}