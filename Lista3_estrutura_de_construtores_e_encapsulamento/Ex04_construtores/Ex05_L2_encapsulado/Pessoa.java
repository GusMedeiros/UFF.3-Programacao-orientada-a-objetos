package Lista3_estrutura_de_construtores_e_encapsulamento.Ex04_construtores.Ex05_L2_encapsulado;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void fazer_aniversario(){
        idade++;
    }
    public void nomear(String nm){
        nome = nm;
    }

    public String get_nome(){
        return nome;
    }

    public int get_idade(){
        return idade;
    }
}
