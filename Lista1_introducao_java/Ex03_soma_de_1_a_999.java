package Lista1_introducao_java;

public class Ex03_soma_de_1_a_999 {
    public static void main(String[] args) {
        int soma = 0;
        for(int i=1;i<1000;i++){
            soma += i;
        }
        System.out.println("A soma de 1+2+3+4+...+999 é igual a: "+soma);
    }
}
