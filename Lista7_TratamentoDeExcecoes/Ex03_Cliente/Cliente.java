package Lista7_TratamentoDeExcecoes.Ex03_Cliente;

public class Cliente {
    public String CPF;

    public Cliente(String CPF) {
        this.setCPF(CPF);
    }

    public static boolean tem11Numeros(String CPF){
        char[] charray = CPF.toCharArray();
        int qtdNumeros = 0;
        for(char c: charray)
            if((int) c >= (int) '0' && (int) c <= '9')
                qtdNumeros++;
        return qtdNumeros == 11;
    }

    public static class DadoInvalidoException extends RuntimeException{
        public DadoInvalidoException(String s) {
            super(s);
        }
    }

    public void setCPF(String CPF) throws DadoInvalidoException {
        if(!Cliente.tem11Numeros(CPF))
            throw new DadoInvalidoException("Quantidade de números no CPF diferente de 11");
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("123.456.789-00.99999999");
        System.out.println(cliente.getCPF());
    }
}
