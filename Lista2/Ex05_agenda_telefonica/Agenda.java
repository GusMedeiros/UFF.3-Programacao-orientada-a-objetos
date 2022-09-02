package Lista2.Ex05_agenda_telefonica;

public class Agenda {
    Contato[] contatos = {};

    void adicionar_contato(String nome, int numero){
        Contato contato = new Contato();
        contato.numero = numero;
        contato.nome = nome;

        Contato[] novo_contatos = new Contato[this.contatos.length + 1];
        System.arraycopy(contatos, 0, novo_contatos, 0, contatos.length);

        novo_contatos[contatos.length] = contato;
        this.contatos = novo_contatos;
    }

    void remover_ultimo_contato(){
        Contato[] novo_contatos = new Contato[contatos.length - 1];
        System.arraycopy(this.contatos,0, novo_contatos, 0, contatos.length - 1);
        this.contatos = novo_contatos;
    }

    void imprimir_contatos(){
        for(Contato contato: this.contatos){
            System.out.println(contato.nome);
        }
    }
}
