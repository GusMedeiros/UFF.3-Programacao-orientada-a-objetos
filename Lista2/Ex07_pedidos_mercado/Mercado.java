package Lista2.Ex07_pedidos_mercado;

public class Mercado {
    Produto[] estoque = {};
    float balanco = 0;

    void estocar(String nome, int quantidade, float preco_unidade){
        Produto novo_produto = new Produto();
        novo_produto = novo_produto.new_Produto(nome, quantidade, preco_unidade);

        Produto[] novo_estoque = new Produto[estoque.length + 1];
        System.arraycopy(estoque,0, novo_estoque, 0, estoque.length);
        novo_estoque[estoque.length] = novo_produto;
        estoque = novo_estoque;
    }
    void mostrar_estoque(){
        System.out.println("Mostrando estoque do mercado:");
        System.out.println("===============================");
        for(Produto produto:estoque){
            System.out.println(produto.quantidade + " unidades de " + produto.nome);
        }
        System.out.println("===============================\n");
    }
    void vender(Pedido pedido){
        for(Item item:pedido.carrinho){
            Produto produto = buscar_produto(item.nome_produto);
            if(produto == null) {
                System.out.println(item.nome_produto+ " não foi encontrado.");
            }
            else if(item.quantidade_pedida <= produto.quantidade){
                produto.quantidade -= item.quantidade_pedida;
                System.out.println("Pedido de "+item.quantidade_pedida+" unidades de "+item.nome_produto+" realizada " +
                        "com sucesso! Novo estoque: "+ produto.quantidade);
            }
            else {
                System.out.println("Erro: temos somente "+produto.quantidade+" unidades de "+produto.nome+".");
            }
        }
    }

    Produto buscar_produto(String nome_produto){
        for(Produto produto:estoque){
            if(produto.nome.equals(nome_produto)) return produto;
        }
        return null;
    }
}
