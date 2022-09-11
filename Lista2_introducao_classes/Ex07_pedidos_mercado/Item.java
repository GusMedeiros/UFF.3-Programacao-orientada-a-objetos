package Lista2_introducao_classes.Ex07_pedidos_mercado;

public class Item {
    String nome_produto;
    int quantidade_pedida;

    static Item new_item(String nome_produto, int quantidade_pedida){
        Item item = new Item();
        item.quantidade_pedida = quantidade_pedida;
        item.nome_produto = nome_produto;
        return item;
    }

}
