package aulaHeranca.cliente;

import aulaHeranca.pessoa.Pessoa;

public class Cliente extends Pessoa {
    protected int pontosFidelidade;
    public Cliente(String nome, String telefone, int pontosFidelidade){
        super(nome, telefone);
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void atualizarCadastro(String nome, String telefone, int pontosFidelidade){
        this.nome = nome;
        this.setTelefone(telefone);
        this.pontosFidelidade = pontosFidelidade;
        System.out.println("Atualizando cadastro do CLIENTE");
    }
    @Override
    public void atualizarCadastro(){
        this.atualizarCadastro(this.nome, this.getTelefone(), this.pontosFidelidade);
    }
    public void teste(){
        especie = "a";
    }
}
