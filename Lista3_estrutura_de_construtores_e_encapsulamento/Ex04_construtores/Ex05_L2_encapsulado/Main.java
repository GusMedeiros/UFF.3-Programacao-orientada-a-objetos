package Lista3_estrutura_de_construtores_e_encapsulamento.Ex04_construtores.Ex05_L2_encapsulado;

public class Main {
    public static void main(String[] args) {
        Pessoa gustavo = new Pessoa("Gustavo", 21);
        for(int i=0; gustavo.get_idade()<21; i++){
            gustavo.fazer_aniversario();
        }
        System.out.println("A pessoa "+gustavo.get_nome()+" tem "+ gustavo.get_idade()+" anos de idade.");

    }
}
