package Lista1;
import java.util.Scanner;
public class Ex02_maior_numero {
    public static void main(String[] args) {
        double r, s, t, maior;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o número R: ");
        r = teclado.nextDouble();
        maior = r;
        System.out.println("Insira o número S: ");
        s = teclado.nextDouble();
        if(s > maior) maior = s;
        System.out.println("Insira o número T: ");
        t = teclado.nextDouble();
        if(t > maior) maior = t;
        System.out.println("Dentre os números digitados, o maior é: "+maior);
    }
}
