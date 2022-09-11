package Lista1_introducao_java;
import java.util.Scanner;
public class Ex08_matriz_quadrado_magico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Inicializando matriz
        System.out.println("Insira a ordem da matriz da matriz quadrada: ");
        int ordem = teclado.nextInt();
        int[][] matriz = new int[ordem][ordem];
        for(int i=0; i<ordem; i++){
            for(int j=0; j<ordem; j++){
                System.out.println("Insira o elemento de linha "+ (i+1)+" e coluna "+ (j+1));
                matriz[i][j] = teclado.nextInt();
            }
        }
        // checando diagonais
        int soma_base = 0, linha_atual, coluna_atual, diag_principal =0, diag_secundaria =0;
        for(int j=0; j<ordem; j++){
            soma_base += matriz[0][j];
            diag_principal += matriz[j][j];
            diag_secundaria += matriz[j][ordem-j-1];
        }
        boolean quadrado_magico = diag_principal == soma_base && diag_secundaria == soma_base;

        // checando linhas e colunas
        for(int i=0; i<ordem && quadrado_magico; i++){
            linha_atual = 0;
            coluna_atual = 0;
            for(int j=0; j<ordem; j++){
                linha_atual += matriz[i][j];
                coluna_atual += matriz[j][i];
            }
            if(linha_atual != soma_base || coluna_atual != soma_base){
                quadrado_magico = false;
                break;
            }
        }
        System.out.print("A matriz ");
        if(!quadrado_magico) System.out.print("não ");
        System.out.println("é um quadrado mágico.");
    }
}
