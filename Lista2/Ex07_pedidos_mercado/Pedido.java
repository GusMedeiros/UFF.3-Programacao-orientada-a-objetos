package Lista2.Ex07_pedidos_mercado;

public class Pedido {
    Item[] carrinho = {};
    String metodo_pagamento;

    void adicionar_ao_carrinho(String nome_produto, int quantidade){
        Item[] novo_carrinho = new Item[carrinho.length + 1];
        System.arraycopy(carrinho, 0, novo_carrinho, 0, carrinho.length);
        novo_carrinho[carrinho.length] = Item.new_item(nome_produto, quantidade);
        carrinho = novo_carrinho;
    }

    void mostrar(){
        System.out.println("Mostrando pedido:");
        System.out.println("==================================");
        for(Item item:carrinho){
            System.out.println(item.quantidade_pedida+" unidades de "+ item.nome_produto);
        }
        System.out.println("==================================");
        System.out.println("Método de pagamento: "+ metodo_pagamento);
        System.out.println("==========FIM DO PEDIDO===========\n");
    }

}
