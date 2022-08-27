import java.util.Scanner;
public class PrimeiraAula{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");

        String nome;
        nome = teclado.nextLine();

        System.out.println("O seu nome é: "+ nome);


        System.out.println("Qual é a sua idade?");
        int idade;
        idade = teclado.nextInt();

        System.out.println("A sua idade é: "+idade);

        System.out.println("Qual a sua altura?");
        float altura;

        altura = teclado.nextFloat();

        System.out.println("Sua altura é: "+altura+"cm.");

    }
}