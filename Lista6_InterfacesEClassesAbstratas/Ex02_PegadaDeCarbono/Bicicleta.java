package Lista6_InterfacesEClassesAbstratas.Ex02_PegadaDeCarbono;

public class Bicicleta implements CarbonFootPrint{
    public int getCarbonFootPrint(){
        return 3;
    }

    @Override
    public String toString() {
        return "Simplesmente uma bicicleta.";
    }
}
