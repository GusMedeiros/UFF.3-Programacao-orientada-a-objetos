package Lista2_introducao_classes.Ex03_casa_qtd_portas_abertas;

public class Porta {
    boolean aberta = false;
    String cor = "Azul";
    float[] dimensoes = {1, 2.2f};


    boolean estaAberta(){
      return aberta;
    };

    void abrir(){
        this.aberta = true;
    }
    void fechar(){
        this.aberta = false;
    }
    void pintar(String cor){
        this.cor = cor;
    }
    void alterar_dimensoes(float x, float y){
        this.dimensoes[0] = x;
        this.dimensoes[1] = y;
    }
}
