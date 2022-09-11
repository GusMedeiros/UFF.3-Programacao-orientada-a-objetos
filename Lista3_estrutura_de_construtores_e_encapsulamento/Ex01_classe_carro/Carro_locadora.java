package Lista3_estrutura_de_construtores_e_encapsulamento.Ex01_classe_carro;

public class Carro_locadora {
    private int[] coordenada_locadora = {0, 0, 0};
    private int[] localizacao_atual;
    private boolean alugado;
    private String cpf_locatario;
    private int dias_alugados, dias_alugados_passados;
    private float combustivel_porcentagem;

    public int[] localizar(){
        return localizacao_atual;
    }

    public Carro_locadora(int[] localizacao_atual, float combustivel_porcentagem){}

    public void alugar(String cpf_locatario, int dias_alugados){}
    public void finalizar_aluguel(){}

    public void abastecer(int qtd_litros){}
    public int get_dias_restantes(){
        return dias_alugados - dias_alugados_passados;
    }
}
