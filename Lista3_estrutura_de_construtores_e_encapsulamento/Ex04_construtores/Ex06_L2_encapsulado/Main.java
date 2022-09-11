package Lista3_estrutura_de_construtores_e_encapsulamento.Ex04_construtores.Ex06_L2_encapsulado;

public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        //baralho.mostrar_cartas();
        baralho.embaralhar();
        baralho.mostrar_cartas();
        baralho.buscar_carta("Ás","Espadas");
    }
}
