package Lista4v2_JavaAPI.Ex01_ListaCompras;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class ListaCompras{
    private final ArrayList<Produto> produtos;
    private BigDecimal precoTotal;

    public ListaCompras(){
        this.produtos = new ArrayList<>();
        this.precoTotal = new BigDecimal(0);
    }

    public BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    public int addProduto(Produto produto){
        for(Produto p:produtos){
            if(p.getNome().equals(produto.getNome())){
                System.out.println("PRODUTO IGNORADO: este produto já existe ("+produto.getNome()+").");
                return -1;
            }
        }
        produtos.add(produto);
        Collections.sort(produtos);
        precoTotal = precoTotal.add(produto.getPrecoTotal());
        return 0;
    }

    public void imprimirListaDeCompras(){
        DecimalFormat dm = new DecimalFormat("#.00");
        System.out.println("LISTA DE COMPRAS:");
        for(Produto p:produtos){
            System.out.println(p.getQtd() +" "+ p.getNome() + "(s)" + " -> R$"+
                    dm.format(p.getPrecoTotal()));
        }
        System.out.println("Valor TOTAL -> R$"+ dm.format(precoTotal));
    }

}
