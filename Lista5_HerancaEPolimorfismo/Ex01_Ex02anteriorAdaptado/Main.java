package Lista5_HerancaEPolimorfismo.Ex01_Ex02anteriorAdaptado;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.of(2022, 10, 17);
        LocalDate dataFim = LocalDate.of(2022, 10, 21);
        LocalTime horaInicioDia = LocalTime.of(9, 0);
        LocalTime horaFimDia = LocalTime.of(18, 0);

        Evento evento = Evento.cadastrarEvento("Semana da Computação", dataInicio, dataFim,
                horaInicioDia, horaFimDia);

        LocalDateTime dataTimePalestra = LocalDateTime.of(2022, 10, 18, 11, 0);
        Professor vania = new Professor("Vania", "vania@email.email", "TCC");
        Palestra palestraBase = new Palestra("Programação Orientada a Objetos", vania,
                "Sala de palestras do IC", dataTimePalestra, 60, 2);

        assert evento != null;
        evento.cadastrarPalestra(palestraBase); // palestra base

        // Testes:
        LocalDateTime inicioEvento = LocalDateTime.of(evento.getDataInicio(), evento.getHoraInicioDia());
        LocalDateTime fimEvento = LocalDateTime.of(evento.getDataFim(), evento.getHoraFimDia());
        Palestra palestraAux = new Palestra("Programação estruturada", vania,
                "Sala de palestras do IC", inicioEvento.minusDays(1), 60, 2);

        // teste de erro de dia antes do inicio do evento:
        System.out.println("Erro esperado: dia da palestra antes do dia inicial do evento ");
        evento.cadastrarPalestra(palestraAux);
        evento.descadastrarPalestra(palestraAux);
        System.out.println();

        // teste de erro de dia depois do fim do evento:
        palestraAux.setDataInicio(fimEvento.plusDays(1).minusMinutes(palestraAux.getDuracao()));
        System.out.println("Erro esperado: dia da palestra após dia final do evento");
        evento.cadastrarPalestra(palestraAux);
        evento.descadastrarPalestra(palestraAux);
        System.out.println();
        // teste de erro de horário antes do horário de início do evento:
        palestraAux.setDataInicio(inicioEvento.minusMinutes(1));
        System.out.println("Erro esperado: horário da palestra antes do horário de início do evento");
        evento.cadastrarPalestra(palestraAux);
        evento.descadastrarPalestra(palestraAux);
        System.out.println();

        // teste de erro de horário após fim do horário de evento:
        palestraAux.setDataInicio(fimEvento.minusMinutes((palestraAux.getDuracao() - 1)));
        System.out.println("Erro esperado: horário do fim da palestra após fim do horário de evento");
        evento.cadastrarPalestra(palestraAux);
        evento.descadastrarPalestra(palestraAux);
        System.out.println();

        // teste de conflito de palestras
        System.out.println("Erro esperado: mesmo lugar com interseção de horários");
        evento.cadastrarPalestra(palestraBase); // cadastrando a mesma palestra 2x para conflito certo.
        System.out.println();

        // teste de máximo de participantes
        Estudante gustavo = new Estudante("Gustavo", "gustavo@email.email", "12345", "Ciência" +
                "da Computação");
        Estudante claudia = new Estudante("Claudia", "claudia@email.email", "12346", "Ciência" +
                "da computação");
        Inscricao.inscrever(gustavo, palestraBase);
        Inscricao.inscrever(claudia, palestraBase);
        System.out.println("Erro esperado: máximo de participantes atingido");
        Inscricao.inscrever(vania, palestraBase);
        System.out.println();

        // teste de máximo de palestras
        palestraAux.setDataInicio(palestraBase.getDataInicio());
        System.out.println("Qtd de palestras antes do teste:"+evento.getQtdPalestras()+"/"+ evento.getMaxPalestras());
        System.out.println("Mudando máximo de palestras para 1.");
        evento.setMaxPalestras(1);
        System.out.println("Tentativa de cadastrar uma segunda palestra:");
        evento.cadastrarPalestra(palestraAux);
        System.out.println("Qtd de palestras após o teste:"+evento.getQtdPalestras()+"/"+ evento.getMaxPalestras());

        // teste listagem de palestras de um participante
        gustavo.printPalestras();
        System.out.println();
        // teste de listagem de palestras do evento:
        evento.printPalestras();

    }
}
