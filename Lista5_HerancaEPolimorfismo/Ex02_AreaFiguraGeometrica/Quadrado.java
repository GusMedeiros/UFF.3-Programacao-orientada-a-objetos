package Lista5_HerancaEPolimorfismo.Ex02_AreaFiguraGeometrica;

public class Quadrado extends Retangulo{

    public Quadrado(double lado) {
        super(lado, lado);
    }

    public double getLado(){
        return this.medidaLados.get(0);
    }
}
