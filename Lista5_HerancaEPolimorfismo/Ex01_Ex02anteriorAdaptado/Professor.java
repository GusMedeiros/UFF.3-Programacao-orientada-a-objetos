package Lista5_HerancaEPolimorfismo.Ex01_Ex02anteriorAdaptado;

public class Professor extends Participante{
    private String departamento;

    Professor(String nome, String email, String departamento) {
        super(nome, email);
        this.departamento = departamento;
    }
}
