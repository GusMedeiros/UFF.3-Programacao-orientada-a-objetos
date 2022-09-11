package Lista3_estrutura_de_construtores_e_encapsulamento.Ex04_construtores.Ex07_L2_encapsulado;

public class Pedido {
    private Item[] carrinho = {};
    private String metodo_pagamento;

    public void adicionar_ao_carrinho(String nome_produto, int quantidade){
        Item[] novo_carrinho = new Item[carrinho.length + 1];
        System.arraycopy(carrinho, 0, novo_carrinho, 0, carrinho.length);
        novo_carrinho[carrinho.length] = Item.new_item(nome_produto, quantidade);
        carrinho = novo_carrinho;
    }

    public void mostrar(){
        System.out.println("Mostrando pedido:");
        System.out.println("==================================");
        for(Item item:carrinho){
            System.out.println(item.get_quantidade_pedida()+" unidades de "+ item.get_nome_produto());
        }
        System.out.println("==================================");
        System.out.println("Método de pagamento: "+ metodo_pagamento);
        System.out.println("==========FIM DO PEDIDO===========\n");
    }

    public Item[] get_carrinho() {
        return carrinho;
    }

}
