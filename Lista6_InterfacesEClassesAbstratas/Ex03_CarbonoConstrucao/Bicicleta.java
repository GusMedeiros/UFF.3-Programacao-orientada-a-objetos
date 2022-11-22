package Lista6_InterfacesEClassesAbstratas.Ex03_CarbonoConstrucao;

public class Bicicleta implements CarbonFootPrint {
    public int getCarbonFootPrint(){
        return 3;
    }

    @Override
    public String toString() {
        return "Simplesmente uma bicicleta.";
    }
}
