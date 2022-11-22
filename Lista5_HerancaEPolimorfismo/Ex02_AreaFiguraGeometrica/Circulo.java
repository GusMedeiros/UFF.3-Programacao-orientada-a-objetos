package Lista5_HerancaEPolimorfismo.Ex02_AreaFiguraGeometrica;

public class Circulo {
    private final double raio;



    Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    public double getDiametro(){
        return 2*raio;
    }

    public double getArea(){
        return 2 * Math.PI * Math.pow(raio, 2);
    }

    public double getCircunferencia(){
        return Math.PI*getDiametro();
    }
}
