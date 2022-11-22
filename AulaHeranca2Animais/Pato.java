package AulaHeranca2Animais;

public class Pato extends Passaro{

    @Override
    public void voar(){
        System.out.println("Voando, mas não tão bem!");
    }

    public void nadar(){
        System.out.println("Nadando, mas não tão bem!");
    }

    public void andar(){
        System.out.println("Andando, mas não tão bem!");
    }

    @Override
    public void fazerRuido(){
        System.out.println("Quack quack");
    }
}

