package Lista5_HerancaEPolimorfismo.Ex03_AgendaContatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PessoaFisica extends Contato{
    protected String nome;
    protected LocalDate aniversario;

    PessoaFisica(String cpf, String nome, String endereco, String aniversario){
        this.nome = nome;
        this.identificador = cpf;
        this.endereco = endereco;
        this.aniversario = LocalDate.parse(aniversario, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getCpf() {
        return super.getIdentificador();
    }

    public void print(){
        System.out.println("Nome: "+nome);
        System.out.println("Aniversario: "+aniversario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("CPF: "+ identificador);
        System.out.println("Endereço: "+ endereco);
    }
}
