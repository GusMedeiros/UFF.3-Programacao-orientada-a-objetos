package Lista6_InterfacesEClassesAbstratas.Ex02_PegadaDeCarbono;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarbonFootPrint> lista = new ArrayList<>();
        lista.add(new Bicicleta());
        lista.add(new Carro("Gasolina", 120));
        lista.add(new Carro("Etanol", 120));
        lista.add(new Construcao(24, 30, true, true));

        for(CarbonFootPrint c : lista){
            System.out.println(c.toString());
            System.out.println(c.getCarbonFootPrint());
        }
    }
}
