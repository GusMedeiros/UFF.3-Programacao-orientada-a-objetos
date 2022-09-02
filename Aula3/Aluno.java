package Aula3;

public class Aluno {
    int matricula;
    float cr;
    String nome;

    String estudar() {
        return "O aluno "+nome+" está estudando.";
    }

    boolean inscrever(String disciplina) {
        return "OO".equals(disciplina);
    }
}
