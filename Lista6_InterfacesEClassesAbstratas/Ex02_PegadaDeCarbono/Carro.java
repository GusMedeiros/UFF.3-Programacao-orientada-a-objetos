package Lista6_InterfacesEClassesAbstratas.Ex02_PegadaDeCarbono;

public class Carro implements CarbonFootPrint{
    protected String combustivel;
    protected double cilindrada;

    public int getCarbonFootPrint(){
        return combustivel.equals("Gasolina")?50:10;
    };

    public Carro(String combustivel, double cilindrada){
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }

    public String toString(){
        return "Carro que usa " +combustivel+", de "+cilindrada+" cilindradas.";
    }
}
