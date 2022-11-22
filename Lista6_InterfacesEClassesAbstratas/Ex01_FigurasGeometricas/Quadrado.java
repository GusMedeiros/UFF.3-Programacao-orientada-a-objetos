package Lista6_InterfacesEClassesAbstratas.Ex01_FigurasGeometricas;

public class Quadrado extends Retangulo{
    public void calcularArea(double lado){
        area = (float)(lado*lado);
    }

    public void calcularPerimetro(double lado){
        perimetro = (float)(lado*4);
    }
}
