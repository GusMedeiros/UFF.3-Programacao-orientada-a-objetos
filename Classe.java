public class Classe<T>{
    <T> String generic (T t){
        return t.getClass().toString();
    }

    public static void main(String[] args) {
        Classe c = new Classe();
        System.out.println(c.generic(1));
    }
}
