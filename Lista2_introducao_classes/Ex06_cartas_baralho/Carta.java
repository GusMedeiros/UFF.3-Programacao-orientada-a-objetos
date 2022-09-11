package Lista2_introducao_classes.Ex06_cartas_baralho;

public class Carta {
    int numero;
    int naipe; // 0 representa copas, 1 espadas, 2 ouros e 3 paus
    void definir_carta(int numero, int naipe){
        this.numero = numero;
        this.naipe = naipe;
    }

    String nome_carta(){
        return switch (numero) {
            case 1 -> "Ás";
            case 11 -> "Valete";
            case 12 -> "Dama";
            case 13 -> "Rei";
            default -> "" + numero;
        };
    }
    String naipe_carta(){
        return switch(naipe) {
            case 0 -> "Copas";
            case 1 -> "Espadas";
            case 2 -> "Ouros";
            case 3 -> "Paus";
            default -> "Naipe inválido";
        };
    }

}
