package Lista1_introducao_java;
import java.util.Scanner;
public class Ex07_opiniao_funcionarios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entrada_atual = 0, qtdpessimas=0, qtdruins = 0, qtdboas = 0, qtdotimas = 0;

        while(entrada_atual >=0 && entrada_atual <= 100){
            System.out.print("Insira uma nota: ");
            entrada_atual = teclado.nextInt();
            if(entrada_atual <= 100 && entrada_atual >75){
                qtdotimas++;
            }
            else if(entrada_atual <=75 && entrada_atual >50){
                qtdboas++;
            }
            else if(entrada_atual <=50 && entrada_atual >25){
                qtdruins++;
            }
            else if(entrada_atual <=25 && entrada_atual >=0){
                qtdpessimas++;
            }
        }
        float total = qtdotimas + qtdboas + qtdruins + qtdpessimas;
        System.out.println("Total de avaliações: "+ total);
        System.out.println("Porcentagem de notas péssimas: "+(qtdpessimas/total)*100);
        System.out.println("Porcentagem de notas ruins: "+(qtdruins/total)*100);
        System.out.println("Porcentagem de notas boas: " + (qtdboas/total)*100);
        System.out.println("Porcentagem de notas ótimas: " + (qtdotimas/total)*100);
    }
}
