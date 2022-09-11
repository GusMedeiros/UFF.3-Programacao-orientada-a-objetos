package Lista3_estrutura_de_construtores_e_encapsulamento.Ex04_construtores.Ex08_L2_encapsulado;

public class Main {
    public static void main(String[] args) {
        // considerei construtores nesse exercício desnecessários.
        Celular celular = new Celular();
        System.out.println(celular.get_carga()+"%");
        celular.fazer_ligacao(60, "2199999999");
        System.out.println(celular.get_carga()+"%");
        celular.enviar_sms("apache", "2199999999");
        System.out.println(celular.get_carga()+"%");
    }
}
