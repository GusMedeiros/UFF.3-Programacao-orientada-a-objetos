package Lista2.Ex03_casa_qtd_portas_abertas;

public class Casa {
    Porta[] portas = {};

    int quantasPortasEstaoAbertas(){
        int contador = 0;
        for (Porta porta:this.portas){
            if(porta.estaAberta()) contador++;
        }
        return contador;
    }

    void construirPortas(int qtd_portas){
        int tamanho = qtd_portas + this.portas.length;
        Porta[] novo_portas = new Porta[tamanho];
        System.arraycopy(this.portas, 0, novo_portas, 0, this.portas.length);
        for(int i=0; i<qtd_portas; i++){
            novo_portas[i+this.portas.length] = new Porta();
        }
        this.portas = novo_portas;
    }
}
