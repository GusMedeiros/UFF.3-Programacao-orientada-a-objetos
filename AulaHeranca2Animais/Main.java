package AulaHeranca2Animais;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Gato());
        animais.add(new Cachorro());
        animais.add(new Pato());
        animais.add(new Leao());
        animais.add(new Galinha());
        for(Animal animal:animais){
            animal.fazerRuido();
            if(animal instanceof Gato){
                (animal).comer();
                ((Gato)animal).comer("ração");
                ((Gato)animal).comer("ração", 150);
            }
        }
    }
}
