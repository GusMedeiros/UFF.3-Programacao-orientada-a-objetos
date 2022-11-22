package ClassesInternas;

public class Main {
    public static void main(String[] args) {
        Externa.Aninhada aninhada = new Externa.Aninhada();
        aninhada.exibir();
        Externa externa = new Externa(5);
        Externa.Interna interna = externa.new Interna();

        externa.testeAnonima(new Object(){
            @Override
            public String toString(){
              return "Sou uma classe anônima";
            }
        });
    }
}
