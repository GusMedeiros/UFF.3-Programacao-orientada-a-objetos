package Lista6_InterfacesEClassesAbstratas.Ex04_FolhaPagamento;

public class Comissionado extends Assalariado{
    int qtdVendas;
    final double vendaMedia = 300;
    final double comissao = 0.035;


    Comissionado(double salario, int qtdVendas) {
        super(salario);
        this.qtdVendas = qtdVendas;
    }

    public double getSalario(){
        return super.getSalario() + qtdVendas * comissao * vendaMedia;
    }


}
