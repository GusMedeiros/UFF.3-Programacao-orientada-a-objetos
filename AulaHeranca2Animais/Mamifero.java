package AulaHeranca2Animais;

public class Mamifero extends Animal{
    float qtdPelos;
    int qtdTetas, qtdOrelhas, qtdDedos;
    int porcentagemPulmao;
    boolean isGravido;

    public void Engravidar() {
        isGravido = true;
    }

    public Mamifero darALuz(){
        isGravido = false;
        return new Mamifero();
    }
    @Override
    public void fazerRuido(){
        System.out.println("Ruído de mamífero genérico");
    }
}
