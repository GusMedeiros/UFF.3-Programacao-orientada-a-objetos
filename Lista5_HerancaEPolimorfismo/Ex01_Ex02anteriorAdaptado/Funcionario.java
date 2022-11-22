package Lista5_HerancaEPolimorfismo.Ex01_Ex02anteriorAdaptado;

public class Funcionario extends Participante{
    private String cargo;

    Funcionario(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }
}
