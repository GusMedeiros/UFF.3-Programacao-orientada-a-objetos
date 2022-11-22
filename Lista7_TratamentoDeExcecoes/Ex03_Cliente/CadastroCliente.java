package Lista7_TratamentoDeExcecoes.Ex03_Cliente;

public class CadastroCliente {
    private final Cliente[] conjunto = new Cliente[10];

    public static class RepositorioException extends Exception{
        RepositorioException(String msg){
            super(msg);
        }
    }
    public static class ClienteInexistenteException extends RuntimeException{
        ClienteInexistenteException(String msg){
            super(msg);
        }
    }
    public static class ClienteJaExistenteException extends RuntimeException{
        ClienteJaExistenteException(String msg){
            super(msg);
        }
    }
    private int tamanhoConjunto = 0;

    public int getTamanhoConjunto() {
        return tamanhoConjunto;
    }

    public void inserir(String CPF) throws RepositorioException, ClienteJaExistenteException{
        if(tamanhoConjunto == 10) throw new RepositorioException("Número máximo de clientes atingido.");

        // Tentar buscar CPF, se não encontrar, inserir e retornar. Se encontrar, joga exceção de já existente.
        try{
            this.buscar(CPF);
        }
        catch(ClienteInexistenteException a) {
            conjunto[tamanhoConjunto++] = new Cliente(CPF);
            return;
        }

        throw new ClienteJaExistenteException("CPF inserido já cadastrado");
    }

    public Cliente buscar(String CPF) throws ClienteInexistenteException{
        if(!Cliente.tem11Numeros(CPF))
            throw new Cliente.DadoInvalidoException("Formato de CPF inválido");
        for(Cliente c: conjunto){
            if (c != null && c.getCPF().equals(CPF)) return c;
        }
        throw new ClienteInexistenteException("Cliente não existente buscado");
    }


}
