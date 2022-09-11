package Lista1_introducao_java;

public class Ex06_fibonacci_to100 {
    public static void main(String[] args) {
        int f_retrasado = 0, f_passado = 1, f;
        System.out.println(0);
        System.out.println(1);
        while(f_passado + f_retrasado <= 100){
            f = f_passado + f_retrasado;
            f_retrasado = f_passado;
            f_passado = f;
            System.out.println(f);
        }

    }
}
