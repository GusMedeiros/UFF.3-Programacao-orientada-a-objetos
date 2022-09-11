package Lista2_introducao_classes.Ex04_televisao;

public class Televisao {
    int volume = 5, canal = 0;
    boolean silenciada = false, ligada = false;

    void definir_canal(int new_canal){
        if(0 <= new_canal && new_canal < 100) this.canal = new_canal;
        else System.out.println("Canal não existe.");
    }
    void descer_canal(){
        if (this.canal > 0) this.canal--;
    }
    void subir_canal() {
        if (this.canal < 99) this.canal++;
    }
    void silenciar(){
        silenciada = true;
    }
    void dessilenciar(){
        silenciada = false;
    }
    void ligar(){
        ligada = true;
    }
    void desigar(){
        ligada = false;
    }
    void imprimir_estado(){
        System.out.println("Volume="+volume);
        System.out.println("Canal="+canal);
        System.out.println("Silenciada="+silenciada);
        System.out.println("Ligada="+ligada);
    }
}
