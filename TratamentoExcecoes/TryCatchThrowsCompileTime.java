package TratamentoExcecoes;

import java.io.IOException;

public class TryCatchThrowsCompileTime {
    public static String lancaExcecao() throws IOException{
        return "a";
    }
    public static void main(String[] args) throws IOException {
        System.out.println(lancaExcecao());
        System.out.println("b");
    }
}
