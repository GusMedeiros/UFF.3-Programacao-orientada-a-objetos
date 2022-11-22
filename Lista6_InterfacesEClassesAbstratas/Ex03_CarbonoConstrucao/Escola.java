package Lista6_InterfacesEClassesAbstratas.Ex03_CarbonoConstrucao;

public class Escola extends Construcao{

    int qtdLivros;

    public Escola(int qtdPessoas, int qtdLampadas, int qtdLivros, boolean usoArCondicionado, boolean usoEnergiaRenovavel) {
        super(qtdPessoas, qtdLampadas, usoArCondicionado, usoEnergiaRenovavel);
        this.qtdLivros = qtdLivros;
    }

    public String toString(){
        return "Casa com "+ qtdPessoas+" pessoas, "+qtdLampadas+" lâmpadas, " + qtdLivros+" livros"+ ", que "+
                (usoEnergiaRenovavel?"":"não")
                +"usa energia renovável, e "+(usoArCondicionado?"":"não")+" usa ar condicionado.";
    }

    @Override
    public int getCarbonFootPrint(){
        return super.getCarbonFootPrint() + qtdLivros;
    }
}
