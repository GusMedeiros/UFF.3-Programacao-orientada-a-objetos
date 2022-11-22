package Lista6_InterfacesEClassesAbstratas.Ex03_CarbonoConstrucao;

abstract class Construcao implements CarbonFootPrint {
    public int qtdPessoas, qtdLampadas;
    public boolean usoEnergiaRenovavel, usoArCondicionado;


    @Override
    public int getCarbonFootPrint() {
         return usoEnergiaRenovavel?1:qtdLampadas + (usoArCondicionado?4*qtdPessoas:1);
    }
    public Construcao(int qtdPessoas, int qtdLampadas, boolean usoArCondicionado, boolean usoEnergiaRenovavel){
        this.qtdPessoas = qtdPessoas;
        this.qtdLampadas = qtdLampadas;
        this.usoArCondicionado = usoArCondicionado;
        this.usoEnergiaRenovavel = usoEnergiaRenovavel;
    }

    public String toString(){
        return "Construção com "+ qtdPessoas+" pessoas, "+qtdLampadas+" lâmpadas, que "+(usoEnergiaRenovavel?"":"não")
                +"usa energia renovável, e "+(usoArCondicionado?"":"não")+" usa ar condicionado.";
    }
}
