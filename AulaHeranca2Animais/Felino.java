package AulaHeranca2Animais;

import org.w3c.dom.ls.LSOutput;

public class Felino extends Animal{
    int qtdPelosBigode;
    int qtdUnhas;
    int corDoPelo;

    public void purr(){
        System.out.println("Prrrrrrr");
    }

    @Override
    public void fazerRuido(){
        System.out.println("Ruido de felino genérico");
    }
}
