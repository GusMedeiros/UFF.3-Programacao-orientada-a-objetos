package Lista4v2_JavaAPI.Ex01_ListaCompras;

import java.math.BigDecimal;

public class Produto implements Comparable<Produto> {
    private String nome;
    private BigDecimal precoUnidade;

    private int qtd;

    Produto(String nome, BigDecimal precoUnidade, int qtd){
        this.nome = nome;
        this.precoUnidade = precoUnidade;
        this.qtd = qtd;
    }

    public BigDecimal getPrecoTotal(){
        return this.precoUnidade.multiply(new BigDecimal(qtd));
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPrecoUnidade() {
        return precoUnidade;
    }

    public int getQtd() {
        return qtd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setPrecoUnidade(BigDecimal precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    @Override
    public int compareTo(Produto p){
        return this.nome.compareTo(p.nome);
    }
}
