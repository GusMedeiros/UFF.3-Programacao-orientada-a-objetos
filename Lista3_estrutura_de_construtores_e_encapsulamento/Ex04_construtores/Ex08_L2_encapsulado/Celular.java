package Lista3_estrutura_de_construtores_e_encapsulamento.Ex04_construtores.Ex08_L2_encapsulado;

public class Celular {
    private Bateria bateria = new Bateria();

    public void enviar_sms(String mensagem, String numero){
        bateria.diminuir_carga(1);
    }

    public void fazer_ligacao(int segundos, String numero){
        bateria.diminuir_carga(segundos/5);
    }

    public int get_carga(){
       return bateria.getCarga_atual();
    }
}
