package Lista5_HerancaEPolimorfismo.Ex02_AreaFiguraGeometrica;

import java.util.ArrayList;

public class Retangulo extends Poligono{


    public Retangulo(double base, double altura){
        super();
        for(int i=0; i<2; i++) {
            this.medidaLados.add(base);
            this.medidaLados.add(altura);
        }
    }

    public double getArea(){
     return this.medidaLados.get(0) * this.medidaLados.get(1);
    }

    public double getAltura(){
        return this.medidaLados.get(1);
    }

    public double getBase(){
        return this.medidaLados.get(0);
    }

}
