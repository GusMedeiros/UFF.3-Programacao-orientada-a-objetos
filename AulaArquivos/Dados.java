package AulaArquivos;

import java.io.Serializable;

public class Dados implements Serializable {
    private final String nome;
    private final String telefone;

    private final Endereco endereco;

    final static long serialVersionUID = 4176893866060156765L;

    Dados(String nome, String telefone, Endereco endereco){
        this.nome = nome; this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
}
