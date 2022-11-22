package AulaArquivos;

import java.io.*;

public class Arquivo<T extends Serializable>{


    public T lerObjeto(String nomeArquivo) throws IOException, ClassNotFoundException {
        ObjectInputStream leitura = new ObjectInputStream(new FileInputStream(nomeArquivo));
        T retorno = (T) leitura.readObject();
        leitura.close();
        return retorno;

    }

    public void escreverString(String nomeArquivo, String str) throws IOException{
        OutputStream escrita = new FileOutputStream(nomeArquivo);
        escrita.write(str.getBytes());
        escrita.close();
    }

    public void escreverObjeto(String nomeArquivo, T o) throws IOException{
        ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(nomeArquivo));
        escrita.writeObject(o);
        escrita.close();
    }

}
