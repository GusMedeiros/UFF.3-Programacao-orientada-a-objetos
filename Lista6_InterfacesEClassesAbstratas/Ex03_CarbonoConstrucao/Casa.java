package Lista6_InterfacesEClassesAbstratas.Ex03_CarbonoConstrucao;

public class Casa extends Construcao{

        int qtdCarros;
    public Casa(int qtdPessoas, int qtdLampadas, int qtdCarros, boolean usoArCondicionado, boolean usoEnergiaRenovavel) {
        super(qtdPessoas, qtdLampadas, usoArCondicionado, usoEnergiaRenovavel);
        this.qtdCarros = qtdCarros;
    }

    public String toString(){
        return "Casa com "+ qtdPessoas+" pessoas, "+qtdLampadas+" lâmpadas, " + qtdCarros+" carros"+ ", que "+
                (usoEnergiaRenovavel?"":"não")
                +"usa energia renovável, e "+(usoArCondicionado?"":"não")+" usa ar condicionado.";
    }
    @Override
    public int getCarbonFootPrint(){
        return super.getCarbonFootPrint() + 15 * qtdCarros;
    }
}
