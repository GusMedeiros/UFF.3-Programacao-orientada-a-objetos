package AulaHeranca2Animais;

public class Canideo extends Mamifero{
    protected boolean isAlfa;

    @Override
    public void fazerRuido(){
        System.out.println("Ruído de canídeo genérico");
    }
    public void uivar(){
        System.out.println("Auuuuuuuuuuuuuuuuuu");
    }

    public void grunir(){
        System.out.println("Grrrr");
    }
}
