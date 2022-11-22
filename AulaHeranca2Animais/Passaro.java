package AulaHeranca2Animais;

public class Passaro extends Animal{
    int qtdPenas;
    public void voar(){
        System.out.println("Voando!!");
    }
    @Override
    public void fazerRuido(){
        System.out.println("Ruido de pássaro genérico");
    }
}
