package Lista3_estrutura_de_construtores_e_encapsulamento.Ex04_construtores.Ex08_L2_encapsulado;

public class Bateria {
    private int carga_maxima = 100, carga_atual = carga_maxima/2;

    public void diminuir_carga(int carga_a_subtrair){
        carga_atual -= carga_a_subtrair;
        if(carga_atual < 0) carga_atual = 0;
    }

    public int getCarga_atual() {
        return carga_atual;
    }
}
