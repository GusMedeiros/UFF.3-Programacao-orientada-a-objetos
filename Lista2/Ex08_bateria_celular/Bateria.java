package Lista2.Ex08_bateria_celular;

public class Bateria {
    int carga_maxima = 100;
    int carga_atual = carga_maxima/2;

    void diminuir_carga(int carga_a_subtrair){
        carga_atual -= carga_a_subtrair;
        if(carga_atual < 0) carga_atual = 0;
    }

}
