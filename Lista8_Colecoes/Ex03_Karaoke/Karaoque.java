package Lista8_Colecoes.Ex03_Karaoke;

import java.util.*;

public class Karaoque {
    private final Map<String, Musica> acervo = new HashMap<>();
    private final Queue<Musica> fila = new LinkedList<>();

    public void addAcervo(Musica musica){
        acervo.put(musica.getNome(), musica);
    }

    public void addFila(String nomeMusica){
        if(!acervo.containsKey(nomeMusica)){
            System.out.println("Música indisponível no acervo.");
            return;
        }
        fila.add(acervo.get(nomeMusica));
    }

    public void pularMusica(){
        if(fila.peek() == null){
            System.out.println("Não há música para pular.");
            return;
        }
        System.out.println("Pulando "+ fila.element().getNome());
        fila.remove();

        if(fila.peek() == null){
            System.out.println("Não há mais músicas para tocar.");
            return;
        }
        System.out.println("Nova música atual: "+fila.element());
    }

    public void playAll(){
        if(fila.peek() == null){
            System.out.println("Não há música para tocar.");
            return;
        }
        System.out.println("Tocando "+ fila.element().getNome());
        fila.remove();
        playAll();
    }

    public void printMusicasPorNome(){
        System.out.println("Músicas por nome:");
        for(Musica m: (acervo.values().stream().sorted(new Comparator<Musica>(){
            @Override
            public int compare(Musica o1, Musica o2){
                return o1.getNome().compareTo(o2.getNome());
            }
        }).toList()))
        {
            System.out.println(m);
        }
    }

    public void printMusicasPorArtista(){
        System.out.println("Músicas por artista:");
        for(Musica m: (acervo.values().stream().sorted(new Comparator<Musica>(){
            @Override
            public int compare(Musica o1, Musica o2){
                return o1.getArtista().compareTo(o2.getArtista());
            }
        }).toList()))
        {
            System.out.println(m);
        }
    }

    public void printFila(){
        System.out.println("Fila de músicas atual:");
        for(Musica m:fila){
            System.out.println(m.getNome());
        }
    }

}
