package Lista4_Atributos_e_metodos_estaticos.Ex02_Semana_da_computacao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.LocalDate;
public class Palestra {
    private String titulo, local;
    private LocalDateTime dataInicio;
    private Participante palestrante;
    private final ArrayList<Participante> participantes = new ArrayList<Participante>();
    private int maxParticipantes, qtdparticipantes, duracao;

    public Palestra(String titulo, Participante palestrante, String local,
                    LocalDateTime dataInicio, int duracao, int maxParticipantes) {
        this.titulo = titulo;
        this.palestrante = palestrante;
        this.local = local;
        this.dataInicio = dataInicio;
        this.duracao = duracao;
        this.maxParticipantes = maxParticipantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNomePalestrante(){
        return palestrante.getNome();
    }

    public String getLocal() {
        return local;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public String getDataString(){
        return dataInicio.getDayOfMonth() + "/" + dataInicio.getMonth() + "/" + dataInicio.getYear();
    }
    public int getQtdVagas(){
        return maxParticipantes - qtdparticipantes;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public String getHorario() {
        return dataInicio.getHour() + ":" + dataInicio.getMinute();
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setPalestrante(Participante palestrante) {
        this.palestrante = palestrante;
    }

    public void addParticipante(Participante participante){
        this.participantes.add(participante);
        this.qtdparticipantes++;
        System.out.println(participante.getNome() + " inscrito(a) com sucesso!");
    }

    public int getQtdparticipantes() {
        return qtdparticipantes;
    }

    public int getDuracao() {
        return duracao;
    }
    public void setDataInicio(LocalDateTime dataInicio){
        this.dataInicio = dataInicio;
    }

    public boolean conflita(Palestra other){
        if(!this.colisao(other)) return false; // se nao tem colisao, não conflita
        return this.local.equals(other.local); // se tem colisao de tempo, só conflita se for no mesmo lugar.
    }

    public boolean colisao(Palestra other){
        LocalDateTime inicioA = this.dataInicio;
        LocalDateTime fimA = this.dataInicio.plusMinutes(this.duracao);
        LocalDateTime inicioB = other.dataInicio;
        LocalDateTime fimB = other.dataInicio.plusMinutes(other.duracao);
        return (inicioA.isBefore(fimB) || inicioA.isEqual(fimB)) &&
                (fimA.isAfter(inicioB) || fimA.isEqual(inicioB));
    }
}
