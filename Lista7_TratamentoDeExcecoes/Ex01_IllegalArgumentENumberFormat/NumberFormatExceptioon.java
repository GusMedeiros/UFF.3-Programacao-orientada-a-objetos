package Lista7_TratamentoDeExcecoes.Ex01_IllegalArgumentENumberFormat;

import java.util.ArrayList;
import java.util.Collection;

public class NumberFormatExceptioon {

    public static ArrayList<Integer> converterListaParaInteiros(Collection<String> strings){
        ArrayList<Integer> i = new ArrayList<Integer>();
        for(String s: strings){
            try {
                i.add(Integer.parseInt(s));
            }
            catch(NumberFormatException a){
                System.out.println("Erro ao tentar converter "+s+" para inteiro.");
            }
        }
        return i;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("123");
        strings.add("1234");
        strings.add("123.4");
        converterListaParaInteiros(strings);
    }
}
