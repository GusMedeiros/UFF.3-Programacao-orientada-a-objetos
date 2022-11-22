package Lista8_Colecoes.Ex02_OrdemDiferentesColecoes;
import java.util.*;
public class Conversoes {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        for(int i=0; i<15; i++)
            lista.add(String.valueOf(i));
        System.out.println("Lista:\n"+ lista);
        // ordem de inserção, pois ArrayLists preservam a ordem de inserção.

        Set<String> set = new HashSet<>(lista);
        System.out.println("Set:\n"+ set);
        // ordem não confiável, pois hashsets ordenam da maneira mais conveniente p seu funcionamento interno

        ArrayDeque<String> arraydeque = new ArrayDeque<>(set);
        System.out.println("ArrayDeque:\n" + arraydeque);
        // assim como arraylists, arrayDeques preservam a ordem de inserção.

        Set<String> treeset = new TreeSet<>(lista);
        System.out.print("Treeset:\n"+treeset);
        /* Treesets preservam a ordem natural, que no caso é crescente.
        Conforme pedido pelo exercício, o tipo genérico é String. Isso, somado à minha escolha de fazer Strings
        numéricas por facilidade de automação da inserção com um for, pode gerar um pouco de confusão com a string "14"
        vindo antes da "2". Entretanto, a confusão vai embora ao se perceber que, assim como "c" vem depois de
        "bcccccc", "14" ou qualquer string iniciada por '1' virá antes de "2" e seus maiores. */



    }
}
