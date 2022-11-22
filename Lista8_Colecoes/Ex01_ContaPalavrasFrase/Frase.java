package Lista8_Colecoes.Ex01_ContaPalavrasFrase;

import java.util.*;

public class Frase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma frase:");
        String frase = scan.nextLine();
        Map<String, Integer> map = new HashMap<>();

        for(String p: frase.split(" "))
            map.put(p, 0);
        for(String p: frase.split(" "))
            map.put(p, map.get(p) + 1);

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(map.entrySet());

        lista.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue()); // truque: como o2 que tá comparando, fica decrescente :)
            }
        });
        System.out.println(lista);
    }
}
