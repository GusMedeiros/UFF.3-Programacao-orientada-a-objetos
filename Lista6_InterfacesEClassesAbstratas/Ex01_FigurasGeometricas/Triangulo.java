package Lista6_InterfacesEClassesAbstratas.Ex01_FigurasGeometricas;

public class Triangulo extends FiguraGeometrica{
    public void calcularArea(double base, double altura){
        area = (float) (base*altura/2);
    }
}
