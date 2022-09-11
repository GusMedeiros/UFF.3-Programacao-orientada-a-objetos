package Lista1_introducao_java;
import java.util.Scanner;
public class Ex05_fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        if(n<0) {
            System.out.println(-1);
        }
        else if (n==0) {
            System.out.println(1);
        }
        else {
            for (int i = n - 1; i > 1; i--) {
                n *= i;
            }
            System.out.println(n);
        }
    }
}
