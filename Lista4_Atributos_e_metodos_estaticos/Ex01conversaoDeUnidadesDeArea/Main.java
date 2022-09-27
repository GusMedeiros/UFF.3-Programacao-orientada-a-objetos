package Lista4_Atributos_e_metodos_estaticos.Ex01conversaoDeUnidadesDeArea;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        double campoEmMetros = 8250;
        System.out.println("Um campo de futebol tem: ");
        System.out.println(df.format(campoEmMetros)+" metros quadrados, ou");
        double campoEmPes = ConversaoDeUnidadesDeArea.metroQuadradoParaPeQuadrado(campoEmMetros);
        System.out.println(df.format(campoEmPes)+" pés quadrados, ou");
        double campoEmAcres = ConversaoDeUnidadesDeArea.peQuadradoParaAcre(campoEmPes);
        System.out.println(df.format(campoEmAcres)+ " acres quadrados, ou");
        double campoEmCm = ConversaoDeUnidadesDeArea.metroQuadradoParaCmQuadrado(campoEmMetros);
        System.out.println(df.format(campoEmCm)+ " centímetros quadrados.");
    }
}
