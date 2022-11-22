package Lista5_HerancaEPolimorfismo.Ex03_AgendaContatos;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();


    public void adicionarContato(String cnpj, String razaoSocial, String endereco, double faturamento){
        contatos.add(new PessoaJuridica(cnpj, razaoSocial, endereco, faturamento));
    }

    public void adicionarContato(String cpf, String nome, String endereco, String aniversario){
        contatos.add(new PessoaFisica(cpf, nome, endereco, aniversario));
    }

    public Contato buscaContato(String cpfOrCnpj){
        for(Contato contato:contatos){
            if(cpfOrCnpj.equals(contato.getIdentificador()))
                return contato;
        }
        return null;
    }

    public void printContatos(){
        System.out.println("=========== LISTANDO AGENDA: ==========");
        for(Contato contato:contatos){
            contato.print();
            System.out.println("=======================================");
        }
    }
}
