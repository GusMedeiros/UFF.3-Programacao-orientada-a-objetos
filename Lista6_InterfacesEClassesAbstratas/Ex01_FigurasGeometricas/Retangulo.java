package Lista6_InterfacesEClassesAbstratas.Ex01_FigurasGeometricas;

public class Retangulo extends FiguraGeometrica{
    public void calcularArea(double lado1, double lado2){
        area = (float)(lado1 * lado2);
    }

    public void calcularPerimetro(double lado1, double lado2){
        perimetro = (float)(2*lado1 + 2*lado2);
    }

}
