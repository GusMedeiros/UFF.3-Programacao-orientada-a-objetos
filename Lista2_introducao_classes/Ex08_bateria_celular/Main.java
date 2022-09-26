package Lista2_introducao_classes.Ex08_bateria_celular;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();
        System.out.println(celular.get_carga()+"%");
        celular.fazer_ligacao(60, "2199999999");
        System.out.println(celular.get_carga()+"%");
        celular.enviar_sms("recebeu esse sms?", "2199999999");
        System.out.println(celular.get_carga()+"%");
    }
}
