package Lista3_estrutura_de_construtores_e_encapsulamento.Ex04_construtores.Ex07_L2_encapsulado;

public class Produto {
    private String nome;
    private int quantidade;
    private float preco;

    public Produto new_Produto(String nome, int quantidade, float preco_unidade){
        Produto produto = new Produto();
        produto.nome = nome;
        produto.quantidade = quantidade;
        produto.preco = preco_unidade;
        return produto;
    }
    public int get_quantidade(){
        return quantidade;
    }

    public void set_quantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String get_nome(){
        return nome;
    }

}
