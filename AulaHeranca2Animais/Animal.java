package AulaHeranca2Animais;

public class Animal {
    protected int qtdOlhos;
    protected double tamanho;
    protected int nivelFome;
    protected int localizacaoX, localizacaoY;

    public void comer(){
        System.out.println("Nom nom nom");
    }

    public void fazerRuido(){
        System.out.println("Ruído de animal genérico");
    }

}
