package TratamentoExcecoes;

import java.util.Scanner;

import static java.lang.System.exit;

public class Trycatch {
    public static int divideint5(int x){
        try{
            System.out.println("a");
            System.out.println(5/x);
            exit(-1);
            return 5/x;

        }
        catch(Exception a){
            System.out.println("b");
            return -1;
        }
        finally{
            System.out.println("c");
        }
    }
    public static void main(String[] args) {
        System.out.println("divide 5/3 = "+divideint5(2));
        int teste = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Início do código");
            int[] v = new int[5];
            v[4] = 1;
            teste = sc.nextInt();
            System.out.println(4 / teste);
            System.out.println(v[6]);
            System.out.println("Fim do código");
        }
        catch(ArithmeticException erro){
            System.out.println("Erro aritmético código. Teste = "+teste);
        }
        catch(ArrayIndexOutOfBoundsException erro){
            System.out.println("Erro de array boundary");
        }
        catch(Exception m){
            System.out.println("Erro desconhecido");
        }

    }

}
