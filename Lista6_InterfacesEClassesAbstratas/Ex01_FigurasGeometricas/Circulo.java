package Lista6_InterfacesEClassesAbstratas.Ex01_FigurasGeometricas;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circulo extends FiguraGeometrica{
    public void calcularArea(double raio){
        this.area = (float) (PI* pow(raio, 2));
    }
    public void calcularPerimetro(double raio){
        this.perimetro = (float)(2 * PI * raio);
    }
}
