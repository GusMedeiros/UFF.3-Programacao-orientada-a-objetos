package Lista8_Colecoes.Ex03_Karaoke;

import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    private Karaoque karaoque;

    Menu(Karaoque karaoque){
        this.karaoque = karaoque;
    }

    public void rodarMenu(){
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("=================================");
            System.out.println("Escolha o que deseja:");
            System.out.println("1. Exibir músicas do acervo (por nome da música)");
            System.out.println("2. Exibir músicas do acervo (por nome do artista)");
            System.out.println("3. Exibir músicas na fila");
            System.out.println("4. Adicionar música à fila");
            System.out.println("5. Tocar todas as músicas da fila");
            System.out.println("6. Sair");

            int resposta = scan.nextInt();
            scan.nextLine();

            switch(resposta){
                case 1:
                    karaoque.printMusicasPorNome();
                    break;
                case 2:
                    karaoque.printMusicasPorArtista();
                    break;
                case 3:
                    karaoque.printFila();
                    break;
                case 4:
                    System.out.println("Insira o nome da música:");
                    karaoque.addFila(scan.nextLine());
                    break;
                case 5:
                    karaoque.playAll();
                    break;
                case 6:
                    System.out.println("Saindo.");
                    exit(1);
                default:
                    System.out.println("Resposta inválida!");
            }
        }
    }
}
