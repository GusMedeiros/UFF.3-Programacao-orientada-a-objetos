package Lista6_InterfacesEClassesAbstratas.Ex03_CarbonoConstrucao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarbonFootPrint> lista = new ArrayList<>();
        lista.add(new Bicicleta());
        lista.add(new Carro("Gasolina", 120));
        lista.add(new Carro("Etanol", 120));
        lista.add(new Casa(24, 30, 1,true, true));
        lista.add(new Escola(60, 45, 120, true, true));

        for(CarbonFootPrint c : lista){
            System.out.println(c.toString());
            System.out.println("Pegada: "+c.getCarbonFootPrint());
        }
    }
}
