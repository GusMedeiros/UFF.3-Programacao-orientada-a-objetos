package Lista2_introducao_classes.Ex06_cartas_baralho;

public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.gerar();
        //baralho.mostrar_cartas();
        baralho.embaralhar();
        baralho.mostrar_cartas();
        baralho.buscar_carta("Ás","Espadas");
    }
}
