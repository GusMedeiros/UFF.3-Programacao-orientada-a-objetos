package TratamentoExcecoes;

public class TryCatchFor {
    public static void tryCatchInterior(){
        int[] v = new int[5];
        System.out.println("Entrando no for");
        for(int i = 0; i<6; i++){
            try {
                v[i] = i;
                System.out.println(i);
            }
            catch(Exception a){
                System.out.println("erro");
            }
        }
        System.out.println("Saindo do for");
    }

    public static void tryCatchExterior(){
        int[] v = new int[5];
        try {
            System.out.println("Entrando no for");
            for (int i = 0; i < 6; i++) {
                v[i] = i;
                System.out.println(i);
            }
            System.out.println("Saindo do for");
        }
        catch(Exception a){
            System.out.println("erro");
        }
    }
    public static void main(String[] args) {
        tryCatchInterior();
        System.out.println();
        tryCatchExterior();
    }
}
