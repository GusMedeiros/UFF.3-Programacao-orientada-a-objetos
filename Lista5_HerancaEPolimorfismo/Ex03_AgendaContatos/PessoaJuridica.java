package Lista5_HerancaEPolimorfismo.Ex03_AgendaContatos;

public class PessoaJuridica extends Contato{
    protected String razaoSocial;
    protected double faturamento;

    PessoaJuridica(String cnpj, String razaoSocial, String endereco, double faturamento){
        this.razaoSocial = razaoSocial;
        this.identificador = cnpj;
        this.endereco = endereco;
        this.faturamento = faturamento;
    }

    public String getCnpj() {
        return super.getIdentificador();
    }

    public void print(){
        System.out.println("Razão social: "+ razaoSocial);
        System.out.println("Cnpj: "+ identificador);
        System.out.println("Endereço: " + endereco);
        System.out.println("Faturamento: R$"+ String.format("%.2f", faturamento));
    }
}
