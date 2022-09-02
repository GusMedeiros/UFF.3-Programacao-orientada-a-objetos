package Aula3;

public class Main {
    public static void main(String[] args) {
        Aluno bom_aluno = new Aluno();
        bom_aluno.nome = "Gabriel";
        bom_aluno.cr = 10;

        System.out.println("Aluno "+bom_aluno.nome+ " criado.");

        Aluno mal_aluno = new Aluno();
        mal_aluno.nome = "Gustavo";
        mal_aluno.cr = 0;

        System.out.println("Aluno "+mal_aluno.nome+" criado.");

        mal_aluno = bom_aluno;

        bom_aluno.nome = "Carlos";
        System.out.println("O mal aluno tem nome "+ mal_aluno.nome);
        System.out.println("O bom aluno tem nome "+ bom_aluno.nome);
    }
}
