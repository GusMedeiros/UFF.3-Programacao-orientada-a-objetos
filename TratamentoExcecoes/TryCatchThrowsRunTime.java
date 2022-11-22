package TratamentoExcecoes;

public class TryCatchThrowsRunTime {
    public static void divisaoPor0(int x) throws Exception{
        System.out.println(x/0);
    }
    public static void main(String[] args) {
        try{
            System.out.println("tentando:");
            divisaoPor0(5);
            System.out.println("Sucesso!");
        }
        catch(Exception a){
            System.out.println("Divisão por 0 detectada");
        }
        finally{
            System.out.println("Finally");
        }
    }
}
