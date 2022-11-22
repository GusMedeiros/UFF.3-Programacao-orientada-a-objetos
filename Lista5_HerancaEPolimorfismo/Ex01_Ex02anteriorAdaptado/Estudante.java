package Lista5_HerancaEPolimorfismo.Ex01_Ex02anteriorAdaptado;

import java.util.ArrayList;

public class Estudante extends Participante{
    private String matricula, curso;

    Estudante(String nome, String email, String matricula, String curso) {
        super(nome, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}
