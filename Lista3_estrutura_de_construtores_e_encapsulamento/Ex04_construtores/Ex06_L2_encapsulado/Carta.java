package Lista3_estrutura_de_construtores_e_encapsulamento.Ex04_construtores.Ex06_L2_encapsulado;

public class Carta {
    private int numero;
    private int naipe; // 0 representa copas, 1 espadas, 2 ouros e 3 paus
    public void definir_carta(int numero, int naipe){
        this.numero = numero;
        this.naipe = naipe;
    }

    public String nome_carta(){
        return switch (numero) {
            case 1 -> "Ás";
            case 11 -> "Valete";
            case 12 -> "Dama";
            case 13 -> "Rei";
            default -> "" + numero;
        };
    }
    public String naipe_carta(){
        return switch(naipe) {
            case 0 -> "Copas";
            case 1 -> "Espadas";
            case 2 -> "Ouros";
            case 3 -> "Paus";
            default -> "Naipe inválido";
        };
    }

}
