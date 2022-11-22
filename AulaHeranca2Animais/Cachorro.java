package AulaHeranca2Animais;

public class Cachorro extends Canideo {
    protected String nomeDono, racaoFavorita, raca;
    protected boolean isDomesticado;

    @Override
    public void fazerRuido(){
        System.out.println("Au au!");
    }
}
