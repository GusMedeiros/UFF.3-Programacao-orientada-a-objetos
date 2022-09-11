package Lista3_estrutura_de_construtores_e_encapsulamento.Ex04_construtores.Ex07_L2_encapsulado;

public class Item {
    private String nome_produto;
    private int quantidade_pedida;

    public static Item new_item(String nome_produto, int quantidade_pedida){
        Item item = new Item();
        item.quantidade_pedida = quantidade_pedida;
        item.nome_produto = nome_produto;
        return item;
    }

    public String get_nome_produto() {
        return nome_produto;
    }

    public int get_quantidade_pedida() {
        return quantidade_pedida;
    }
}
