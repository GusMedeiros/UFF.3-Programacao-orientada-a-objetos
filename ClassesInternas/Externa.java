package ClassesInternas;

public class Externa{
    private static int valorstatic;
    private int valor;
    public Externa(int valor){
        this.valor = valor;
    }

    public static class Aninhada {
        public void exibir(){
            System.out.println("valorstatic ="+valorstatic);
        }
    }

    public class Interna {
        public void exibir(){
            System.out.println("valorstatic ="+valor);
        }
    }

    public void testeAnonima(Object o){
        System.out.println(o.toString());
    }
}
