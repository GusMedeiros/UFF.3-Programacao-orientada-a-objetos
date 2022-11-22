package AulaCollections;

import java.util.*;

public class TocaMusica {
    private final Set<String> musicas = new HashSet<>();

    public void addMusica(String musica){
        this.musicas.add(musica);
    }

    public void printMusicas(){
        for(String m:this.musicas){
            System.out.print(m.toString()+", ");
        }
        System.out.println("\n");
}

    public static void main(String[] args) {
        TocaMusica tocaMusica = new TocaMusica();
        for(int i=1; i<15; i++) {
            tocaMusica.addMusica("Musica" + i);
            tocaMusica.addMusica("Musica" + (i+1));
        }
        tocaMusica.printMusicas();
    }
}
