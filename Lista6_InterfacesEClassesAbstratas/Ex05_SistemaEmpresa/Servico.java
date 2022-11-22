package Lista6_InterfacesEClassesAbstratas.Ex05_SistemaEmpresa;

public class Servico implements Recebivel{
    private String descricao;
    private int horas;
    private double precoHora;

    public double totalizarReceita(){
        return horas * precoHora;
    }

    @Override
    public String toString(){
        return horas +" hora"+(horas!=1?"s":"")+" de "+descricao+" por R$"+precoHora+" a hora.";
    }

    public Servico(String descricao, int horas, double precoHora){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public int compareTo(Recebivel o) {
        return this.getDescricao().compareTo(o.getDescricao());
    }
}
