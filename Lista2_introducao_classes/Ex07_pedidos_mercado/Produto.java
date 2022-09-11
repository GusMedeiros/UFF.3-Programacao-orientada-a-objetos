package Lista2_introducao_classes.Ex07_pedidos_mercado;

public class Produto {
    String nome;
    int quantidade;
    float preco;

    Produto new_Produto(String nome, int quantidade, float preco_unidade){
        Produto produto = new Produto();
        produto.nome = nome;
        produto.quantidade = quantidade;
        produto.preco = preco_unidade;
        return produto;

    }
}
