package Lista4_Atributos_e_metodos_estaticos.Ex02_Semana_da_computacao;

import org.w3c.dom.ls.LSOutput;

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
