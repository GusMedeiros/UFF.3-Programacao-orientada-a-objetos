package Lista2_introducao_classes.Ex02_porta_abrir_fechar;

public class Main {
    public static void main(String[] args) {
        Porta porta = new Porta();
        for(int i=0; i<5; i++) {
            if(porta.estaAberta()){
                porta.fechar();
            }
            else {
                porta.abrir();
            }
            System.out.println("A porta está " + (porta.estaAberta() ? "aberta" : "fechada" + "."));
        }
        for(int i=0; i<5; i++) {
            if (porta.cor.equals("Marrom")) {
                porta.pintar("Azul");
            }
            else {
                porta.pintar("Marrom");
            }
            System.out.println("A cor da porta é " + porta.cor + ".");
        }
        for(int i=0; i<5; i++) {
            if (porta.dimensoes[0] == 1f && porta.dimensoes[1] == 2.2f) {
                porta.alterar_dimensoes(2.2f, 1f);
            } else if (porta.dimensoes[0] == 2.2f && porta.dimensoes[1] == 1f) {
                porta.alterar_dimensoes(1f, 2.2f);
            }
            System.out.println("As dimensões da porta são: "+porta.dimensoes[0]+"m x "+porta.dimensoes[1]+"m.");
        }
        System.out.println();
    }
}
