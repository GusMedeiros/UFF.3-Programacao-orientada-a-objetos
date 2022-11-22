package AulaArquivos;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Arquivo<Dados> arquivo = new Arquivo<>();
        //arquivo.escreverObjeto("AulaArquivos/teste.bin", new Dados("Gustavo", "1234", new Endereco()));
        System.out.println(arquivo.lerObjeto("AulaArquivos/teste.bin").getNome());
    }
}
