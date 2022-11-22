package Lista8_Colecoes.Ex03_Karaoke;

public class Musica {
    private final String nome;
    private final String artista;

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    Musica(String nome, String artista){
        this.nome = nome;
        this.artista = artista;
    }

    @Override
    public boolean equals(Object o2){
        if(o2 == this)
            return true;
        if(!(o2 instanceof Musica))
            return false;
        return ((Musica) o2).getNome().equals(this.getNome());

    }

    @Override
    public String toString(){
        return nome + " ("+ artista+")";
    }
}
