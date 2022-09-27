package Lista4v2_JavaAPI.Ex01_ListaCompras;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();
        lista.addProduto(new Produto("Morango", new BigDecimal(1), 12));
        lista.addProduto(new Produto("Vassoura", new BigDecimal(20), 1));
        lista.addProduto(new Produto("Drumete", new BigDecimal("2.5"), 20));
        lista.addProduto(new Produto("Pano", new BigDecimal(7), 4));
        lista.addProduto(new Produto("Tapete", new BigDecimal(100), 2));
        lista.addProduto(new Produto("Sabonete", new BigDecimal(4), 8));
        lista.addProduto(new Produto("Escova de dente", new BigDecimal(15), 3));
        lista.addProduto(new Produto("Notebook", new BigDecimal("3249.99"), 1));
        // Repetidos:
        lista.addProduto(new Produto("Morango", new BigDecimal(2), 7));
        lista.addProduto(new Produto("Tapete", new BigDecimal(100), 2));

        lista.imprimirListaDeCompras();
    }
}
