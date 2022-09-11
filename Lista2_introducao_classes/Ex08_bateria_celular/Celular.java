package Lista2_introducao_classes.Ex08_bateria_celular;

public class Celular {
    Bateria bateria = new Bateria();

    void enviar_sms(String mensagem, String numero){
        bateria.diminuir_carga(1);
    }

    void fazer_ligacao(int segundos, String numero){
        bateria.diminuir_carga(segundos/5);
    }

    int get_carga(){
       return bateria.carga_atual;
    }
}
