package Lista1;
import java.util.Scanner;

public class Ex01_conta_negativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos números você quer inserir?");
        int qtd_total = teclado.nextInt();
        int qtd_negativos = 0;
        for(int i=0; i<qtd_total; i++) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            int int_atual = teclado.nextInt();
            if(int_atual < 0) qtd_negativos++;
        }
        System.out.println(qtd_negativos);
    }
}
