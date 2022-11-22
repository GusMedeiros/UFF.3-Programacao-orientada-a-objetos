package AulaHeranca2Animais;

public class Galinha extends Passaro{

    public void voar(){
        System.out.println("A galinha não conseguiu voar");
    }

    @Override
    public void fazerRuido(){
        System.out.println("Cocó!!");
    }
}
