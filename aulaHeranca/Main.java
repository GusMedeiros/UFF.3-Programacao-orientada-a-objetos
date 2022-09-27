package aulaHeranca;

import aulaHeranca.cliente.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gustavo", "(21)0000-0000", 0);
        Cliente cliente2 = new Cliente("Pedro", "(21)0000-0001", 0);

        System.out.println(cliente.getNome());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getPontosFidelidade());

        cliente.atualizarCadastro("Cláudio", "(21)1234-5678", 0);
        cliente2.atualizarCadastro();
        cliente.teste();
    }
}
