package TiposGenericos;

public class Generica{

    public enum t{
        ENTREGUE (0),
        PEDIDA(1);
        private int valor;

        t(int x) {
            this.valor = x;
        }
        public static void teste(t bla){
            System.out.println(bla.valor);
        }
    }

    public static void main(String[] args) {
        t.teste(t.PEDIDA);
    }
}
