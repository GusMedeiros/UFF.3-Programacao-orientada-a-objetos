package Lista6_InterfacesEClassesAbstratas.Ex05_SistemaEmpresa;

public class ItemVenda implements Recebivel{
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    @Override
    public String getDescricao() {
        return descricao;
    }

    public double totalizarReceita(){
        return quantidade * precoUnitario;
    }

    @Override
    public String toString(){
      return quantidade + " "+descricao+((quantidade!=1)?("s"):(""))+" por R$"+precoUnitario+" a unidade.";
    };

    public ItemVenda(String descricao,int quantidade,double precoUnitario){
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public int compareTo(Recebivel o) {
        return this.getDescricao().compareTo(o.getDescricao());
    }
}
