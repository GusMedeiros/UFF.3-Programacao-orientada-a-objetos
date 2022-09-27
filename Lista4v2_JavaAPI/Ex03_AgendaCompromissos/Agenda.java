package Lista4v2_JavaAPI.Ex03_AgendaCompromissos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Agenda {
    ArrayList<Compromisso> compromissos = new ArrayList<>();

    public void inserirCompromissos(){
        Scanner teclado = new Scanner(System.in);
        String continuar;
        do {
            System.out.println("Criando compromisso:");
            System.out.print("Insira o título: ");

            String titulo = teclado.nextLine();

            System.out.print("Insira o nome do local: ");
            String local = teclado.nextLine();

            System.out.print("Insira a data (DD/MM/AAAA): ");
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate data = LocalDate.parse(teclado.nextLine(), dateFormat);


            compromissos.add(new Compromisso(titulo, local, data));

            System.out.print("Deseja continuar? (S/N): ");
            continuar = teclado.nextLine();
        } while(continuar.equals("S") || continuar.equals("s"));
        Collections.sort(compromissos);
    }

    public void imprimirDia(String data, String lingua){
        Locale locale;
        if(lingua.equals("Português") || lingua.equals("português")){
            locale = new Locale("pt-BR");
        }
        else if(lingua.equals("Inglês") || lingua.equals("inglês")){
            locale = new Locale("en-US");
        }
        else{
            System.out.println("ERRO: LINGUA SELECIONADA INVÁLIDA");
            return;
        }

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate dataParsed = LocalDate.parse(data, dateFormat);
        System.out.println("Imprimindo compromissos do dia "+ data+":");
        for(Compromisso c: compromissos){
            if(c.getData().equals(dataParsed)){
                c.imprimirCompromisso(locale);
            }
        }
    }
}
