package Lista7_TratamentoDeExcecoes.Ex02_ContaCorrente;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(500, 1000, 250);
        try {
            conta.depositar(-50);
        }
        catch(IllegalArgumentException a){
            System.out.println("ERRO AO DEPOSITAR:");
            System.out.println(a.getMessage());
        }

        try {
            conta.sacar(-50);
        }
        catch(IllegalArgumentException a){
            System.out.println("ERRO AO SACAR:");
            System.out.println(a.getMessage());
        }

        try {
            conta.setValorLimite(-50);
        }
        catch(IllegalArgumentException a){
            System.out.println("ERRO AO SETAR VALOR LIMITE");
            System.out.println(a.getMessage());
        }
    }
}
