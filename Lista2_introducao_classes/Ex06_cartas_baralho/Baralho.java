package Lista2_introducao_classes.Ex06_cartas_baralho;

import java.util.Random;

public class Baralho {
    Carta[] cartas = new Carta[52];

    void gerar(){
        int i = 0;
        for(int naipe = 0; naipe<4; naipe++){
            for(int numero=1; numero<=13; numero++){
                this.cartas[i] = new Carta();
                this.cartas[i].definir_carta(numero, naipe);
                i++;
            }
        }
    }

    void embaralhar(){
        Carta aux;
        Random rand = new Random();
        for(int i=0; i<this.cartas.length;i++){
            aux = this.cartas[i];
            int i_rand = rand.nextInt(52);
            this.cartas[i] = this.cartas[i_rand];
            this.cartas[i_rand] = aux;
        }
    }

    void mostrar_cartas(){
        System.out.println("Cartas do topo ao fundo do baralho:");
        for(Carta carta : cartas){
            System.out.println(carta.nome_carta()+" de "+carta.naipe_carta());
        }
    }

    void buscar_carta(String numero, String naipe){
        for(int i=0; i<52; i++){
            if (numero.equals(this.cartas[i].nome_carta()) && naipe.equals(this.cartas[i].naipe_carta())){
                System.out.println("A carta " + cartas[i].nome_carta()+" de "+cartas[i].naipe_carta()
                +" está abaixo de "+i+" cartas.");
                return;
            }
        }
        System.out.println("Carta não encontrada.");
    }

    void mostrar_carta(int indice){
        System.out.println(this.cartas[indice]);
    }
}

