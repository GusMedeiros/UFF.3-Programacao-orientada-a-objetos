package Lista4v2_JavaAPI.Ex03_AgendaCompromissos;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner teclado = new Scanner(System.in);
        agenda.inserirCompromissos();
        System.out.println("Insira a data que quer imprimir e a língua:");
        System.out.println("Data (dd/mm/yyyy):");
        String data = teclado.nextLine();
        System.out.println("Língua (Inglês/Português):");
        String lingua = teclado.next();

        agenda.imprimirDia(data, lingua);
    }
}
