package Lista7_TratamentoDeExcecoes.Ex03_Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroCliente cadastro = new CadastroCliente();
        Scanner scanner = new Scanner(System.in);
        String entrada = "a";
        while(!entrada.equals("")) {
            try {
                System.out.print("Insira um CPF: ");
                entrada = scanner.nextLine();
                cadastro.inserir(entrada);
            } catch (CadastroCliente.ClienteJaExistenteException | Cliente.DadoInvalidoException |
                     CadastroCliente.RepositorioException er) {
                System.out.println("Exceção: "+ er.getClass().getSimpleName());
                System.out.println(er.getMessage());
            }
        }
    }
}
