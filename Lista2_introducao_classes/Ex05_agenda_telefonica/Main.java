package Lista2_introducao_classes.Ex05_agenda_telefonica;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionar_contato("Gustavo", 123);
        agenda.adicionar_contato("Vania", 124);
        agenda.adicionar_contato("Andre", 125);
        agenda.imprimir_contatos();
    }
}
