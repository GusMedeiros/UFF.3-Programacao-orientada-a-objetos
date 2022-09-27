package aulaHeranca.pessoa;

public class Pessoa {
    protected static String especie = "Homo Sapiens Sapiens";
    protected String nome;
    private String telefone;
    protected Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void atualizarCadastro(){
        System.out.println("Atualizando cadastro da PESSOA");
    }
}
