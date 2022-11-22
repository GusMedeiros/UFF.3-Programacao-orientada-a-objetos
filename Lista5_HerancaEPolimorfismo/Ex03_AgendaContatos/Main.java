package Lista5_HerancaEPolimorfismo.Ex03_AgendaContatos;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato("123-456-789-00", "Gustavo", "UFF", "03/10/2001");
        agenda.adicionarContato("12.345.678/0001-00", "GustavoCompany", "IC", 0.50);

        agenda.printContatos();
        System.out.println("\n\n");
        System.out.println("Buscando contatos por cpf/cnpj:");
        agenda.buscaContato("123-456-789-00").print();
        System.out.println("==========================");
        agenda.buscaContato("12.345.678/0001-00").print();
    }

}
