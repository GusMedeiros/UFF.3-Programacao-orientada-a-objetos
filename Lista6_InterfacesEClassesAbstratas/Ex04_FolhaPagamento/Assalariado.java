package Lista6_InterfacesEClassesAbstratas.Ex04_FolhaPagamento;

public class Assalariado implements Funcionario{
    protected double salario;


    Assalariado(double salario){
        this.salario = salario;
    }
    @Override
    public double getSalario() {
        return salario * 1.1;
    }
}
