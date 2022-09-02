package Lista2.Ex04_televisao;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.definir_canal(99);
        tv.ligar();
        while(tv.canal!= 50){
            tv.descer_canal();
        }
        while(tv.canal != 75){
            tv.subir_canal();
        }
        tv.silenciar();

        tv.imprimir_estado();
    }
}
