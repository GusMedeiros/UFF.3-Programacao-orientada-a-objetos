package Lista5_HerancaEPolimorfismo.Ex02_AreaFiguraGeometrica;

import java.util.ArrayList;

public class Poligono {
    protected ArrayList<Double> medidaLados;
    protected int qtdLados;

    public double getPerimetro(){
        double perimetro = 0;
        for(double lado: medidaLados){
            perimetro+= lado;
        }
        return perimetro;
    }

    public Poligono(ArrayList<Double> medidaLados){
        this.medidaLados = medidaLados;
    }
    protected Poligono(){
        this.medidaLados = new ArrayList<>();
        this.qtdLados = 0;
    }

    public void printLados(){
        int i =0;
        for(double lado: medidaLados){
            System.out.println("Lado "+ i++ +lado);
        }
    }
}
