package Lista5_HerancaEPolimorfismo.Ex01_Ex02anteriorAdaptado;

public class Inscricao {
    private Palestra palestra_alvo;
    private Participante participante;

    public static void inscrever(Participante participante, Palestra palestra){
        if(palestra.getQtdparticipantes() >= palestra.getMaxParticipantes()) {
            System.out.println("ERRO: Máximo de participantes atingido!");
            return;
        }
        palestra.addParticipante(participante);
        participante.addPalestra(palestra);
    }
}
