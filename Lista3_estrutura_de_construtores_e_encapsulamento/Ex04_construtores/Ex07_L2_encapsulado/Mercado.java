package Lista3_estrutura_de_construtores_e_encapsulamento.Ex04_construtores.Ex07_L2_encapsulado;

public class Mercado {
    private Produto[] estoque = {};
    private float balanco = 0;

    public void estocar(String nome, int quantidade, float preco_unidade){
        Produto novo_produto = new Produto();
        novo_produto = novo_produto.new_Produto(nome, quantidade, preco_unidade);

        Produto[] novo_estoque = new Produto[estoque.length + 1];
        System.arraycopy(estoque,0, novo_estoque, 0, estoque.length);
        novo_estoque[estoque.length] = novo_produto;
        estoque = novo_estoque;
    }
    public void mostrar_estoque(){
        System.out.println("Mostrando estoque do mercado:");
        System.out.println("===============================");
        for(Produto produto:estoque){
            System.out.println(produto.get_quantidade() + " unidades de " + produto.get_nome());
        }
        System.out.println("===============================\n");
    }
    public void vender(Pedido pedido){
        for(Item item:pedido.get_carrinho()){
            Produto produto = buscar_produto(item.get_nome_produto());
            if(produto == null) {
                System.out.println(item.get_nome_produto()+ " não foi encontrado.");
            }
            else if(item.get_quantidade_pedida() <= produto.get_quantidade()){
                produto.set_quantidade(produto.get_quantidade() - item.get_quantidade_pedida());
                System.out.println("Pedido de "+item.get_quantidade_pedida()+" unidades de "+item.get_nome_produto()+" realizada " +
                        "com sucesso! Novo estoque: "+ produto.get_quantidade());
            }
            else {
                System.out.println("Erro: temos somente "+produto.get_quantidade()+" unidades de "+produto.get_nome()+".");
            }
        }
    }

    public Produto buscar_produto(String nome_produto){
        for(Produto produto:estoque){
            if(produto.get_nome().equals(nome_produto)) return produto;
        }
        return null;
    }
}
