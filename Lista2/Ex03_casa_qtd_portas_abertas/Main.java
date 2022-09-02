package Lista2.Ex03_casa_qtd_portas_abertas;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.construirPortas(3);
        casa.portas[0].abrir();
        System.out.println("A casa está com "+ casa.quantasPortasEstaoAbertas()+ " porta(s) aberta(s).");
        casa.portas[1].abrir();
        System.out.println("A casa está com "+ casa.quantasPortasEstaoAbertas()+ " porta(s) aberta(s).");
    }
}
