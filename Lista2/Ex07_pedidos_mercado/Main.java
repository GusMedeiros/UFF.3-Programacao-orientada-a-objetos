package Lista2.Ex07_pedidos_mercado;

public class Main {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();
        mercado.estocar("Morango", 20, 2.99f);
        mercado.estocar("Abacaxi", 10, 8.99f);
        mercado.estocar("Uva", 50, 2.99f);
        mercado.estocar("Linguiça", 20, 7.50f);

        Pedido pedido = new Pedido();
        pedido.metodo_pagamento = "Cartão";
        pedido.adicionar_ao_carrinho("Abacaxi", 8);
        pedido.adicionar_ao_carrinho("Linguiça", 8);

        pedido.mostrar();

        mercado.mostrar_estoque();
        mercado.vender(pedido);
    }
}
