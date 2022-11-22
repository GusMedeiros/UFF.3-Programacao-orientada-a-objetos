package Lista5_HerancaEPolimorfismo.Ex02_AreaFiguraGeometrica;

public class Triangulo extends Poligono{

    public static Triangulo newTriangulo(double lado1, double lado2, double lado3){
        if(!(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)){
            System.out.println("Triângulo impossível!");
            return null;
        }
        return new Triangulo(lado1, lado2, lado3);
    }
    private Triangulo(double lado1, double lado2, double lado3){
        this.medidaLados.add(lado1);
        this.medidaLados.add(lado2);
        this.medidaLados.add(lado3);
    }

    double getArea(){
        double s = this.getPerimetro()/2;
        double areaSquared = 1;
        for(double lado: this.medidaLados){
             areaSquared *= (s - lado);
        }
        System.out.println(s);
        return Math.sqrt(s*areaSquared);
    }
}
