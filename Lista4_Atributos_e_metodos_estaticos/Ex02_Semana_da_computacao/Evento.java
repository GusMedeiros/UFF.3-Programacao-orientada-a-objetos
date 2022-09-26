package Lista4_Atributos_e_metodos_estaticos.Ex02_Semana_da_computacao;

import java.time.*;
import java.util.ArrayList;

public class Evento {
    // static variables
    private static Evento instancia;
    // instance variables
    private int maxPalestras = 20;
    private int qtdPalestras;
    private final ArrayList<Palestra> palestras = new ArrayList<>();
    private String titulo;
    private LocalDate dataInicio, dataFim;
    private LocalTime horaInicioDia, horaFimDia;


    private Evento(String titulo, LocalDate dataInicio, LocalDate dataFim,
                   LocalTime horaInicioDia, LocalTime horaFimDia){
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horaInicioDia = horaInicioDia;
        this.horaFimDia = horaFimDia;
        Evento.instancia = this;
    }

    public Evento getInstancia(){
        return instancia;
    }

    void printPalestras(){
        for(Palestra p:palestras){
            System.out.println("Palestra "+ p.getTitulo()+":");
            System.out.println("Palestrante: "+p.getNomePalestrante());
            System.out.println("Quantidade de participantes: "+p.getQtdparticipantes()+"/"+p.getMaxParticipantes());
            System.out.println("Lista de participantes: ");
            for(Participante participante: p.getParticipantes()){
                System.out.println(participante.getNome());
            }
        }
    }
    public static Evento cadastrarEvento(String titulo, LocalDate dataInicio, LocalDate dataFim,
                                         LocalTime horaInicioDia, LocalTime horaFimDia){
        if(Evento.instancia != null){
            System.out.println("Erro: somente um evento permitido.");
            return null;
        }
        if(dataInicio.isAfter(dataFim)){
            System.out.println("Erro: data inicial é maior que a final");
            return null;
        }
        if(horaInicioDia.isAfter(horaFimDia)){
            System.out.println("Erro: horário inicial é maior que o final");
            return null;
        }
        return new Evento(titulo, dataInicio, dataFim, horaInicioDia, horaFimDia);
    }
    public void cadastrarPalestra(Palestra palestra){
        if(this.palestras.size() >= maxPalestras){
            System.out.println("ERRO! Máximo de palestras atingido.");
            return;
        }
        if(palestra.getDataInicio().toLocalDate().isBefore(this.dataInicio)){
            System.out.println("ERRO! Dia da palestra é antes do dia evento.");
            return;
        }

        if(palestra.getDataInicio().toLocalTime().isBefore(this.horaInicioDia)){
            System.out.println("ERRO! Início da palestra é antes do horário de evento.");
            return;
        }
        if(palestra.getDataInicio().toLocalDate().isAfter(dataFim)){
            System.out.println("ERRO! Início da palestra após dia final do evento.");
            return;
        }

        if(palestra.getDataInicio().toLocalTime().plusMinutes(palestra.getDuracao()).isAfter(this.horaFimDia)){
            System.out.println("ERRO! Fim da palestra é depois fim do horário de evento.");
            return;
        }
        for (Palestra p:this.palestras) {
            if(palestra.conflita(p)){
                System.out.println("ERRO! Palestras são no mesmo lugar e têm interseção de horário.");
                return;
            }
        }
        palestras.add(palestra);
        this.qtdPalestras++;
        System.out.println("Palestra cadastrada com sucesso!");
    }

    public void setMaxPalestras(int maxPalestras) {
        this.maxPalestras = maxPalestras;
    }

    public void descadastrarPalestra(Palestra palestra){
        palestras.remove(palestra);
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public int getMaxPalestras() {
        return maxPalestras;
    }

    public int getQtdPalestras() {
        return qtdPalestras;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public LocalTime getHoraInicioDia() {
        return horaInicioDia;
    }

    public LocalTime getHoraFimDia() {
        return horaFimDia;
    }
}