package AulaHeranca2Animais;

import java.util.ArrayList;

public class Gato extends Felino {
    String nomeDono;
    boolean isDomesticado;
    String racaoFavorita;
    String raca;
    ArrayList<String> coresDoPelo;

    @Override
    public void fazerRuido(){
        System.out.println("Miauu");
    }

    @Override
    public void comer(){
        System.out.println("Estou comendo");
    }

    public void comer(String comida){
        System.out.println("Estou comendo " + comida);
    }

    public void comer(String comida, double gramas){
        System.out.println("Estou comendo "+gramas+"g de "+comida);
    }
}
