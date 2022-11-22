package Lista8_Colecoes.Ex03_Karaoke;

public class Main {
    public static void inicializarAcervo(Karaoque karaoque){
        karaoque.addAcervo(new Musica("Evidencias", "Chitãozinho e Xororó"));
        karaoque.addAcervo(new Musica("Sinônimos", "Chitãozinho e Xororó"));
        karaoque.addAcervo(new Musica("Alô", "Chitãozinho e Xororó"));
        karaoque.addAcervo(new Musica("Unholy", "Sam Smith"));
        karaoque.addAcervo(new Musica("Poesia Acústica #13", "Pineapple"));
        karaoque.addAcervo(new Musica("As It Was", "Harry Styles"));
        karaoque.addAcervo(new Musica("Watermelon Sugar", "Harry Styles"));
        karaoque.addAcervo(new Musica("Deserto", "Maria Marçal"));
        karaoque.addAcervo(new Musica("Infinito", "Maria Marçal"));

        karaoque.addAcervo(new Musica("Haja Colírio", "Guilherme e Benuto"));
    }

    public static void main(String[] args) {
        Karaoque karaoque = new Karaoque();
        inicializarAcervo(karaoque);
        new Menu(karaoque).rodarMenu();

    }
}
