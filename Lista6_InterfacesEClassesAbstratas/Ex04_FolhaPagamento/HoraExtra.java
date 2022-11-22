package Lista6_InterfacesEClassesAbstratas.Ex04_FolhaPagamento;

public class HoraExtra extends Assalariado {

    private double salarioHora;
    private int qtdHorasTrabalhadas;

    HoraExtra(double salario, double salarioHora, int qtdHorasTrabalhadas) {
        super(salario);
        this.salarioHora = salarioHora;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public double getSalario(){
        if(qtdHorasTrabalhadas <= 40) return super.getSalario();
        return salario + (qtdHorasTrabalhadas - 40) * salarioHora;
    }


}
