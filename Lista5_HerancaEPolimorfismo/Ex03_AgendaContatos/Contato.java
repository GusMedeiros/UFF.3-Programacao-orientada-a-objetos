package Lista5_HerancaEPolimorfismo.Ex03_AgendaContatos;

public class Contato {
    protected String endereco;
    protected String identificador;

    public String getIdentificador(){
        return identificador;
    }

    public void print(){
        System.out.println("Identificador: " + identificador);
        System.out.println("Endereço: " + endereco);
    }


}
