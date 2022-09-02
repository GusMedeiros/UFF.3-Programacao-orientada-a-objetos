package Aula3;

public class Carro {
    String modelo, cor;
    int qtd_rodas, pessoas_a_bordo;
    float valor, quilometragem, litros_gasolina, velocidade;
    float[] direcao = {1, 1};
    float[] teste = new float[2];
    void acelerar(float aceleracao){
        velocidade += aceleracao;
    }

    void girar_volante(float[] nova_direcao){
        direcao = nova_direcao;
    }
}
