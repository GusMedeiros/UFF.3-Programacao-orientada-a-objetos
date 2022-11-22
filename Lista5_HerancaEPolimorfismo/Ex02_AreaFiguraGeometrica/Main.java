package Lista5_HerancaEPolimorfismo.Ex02_AreaFiguraGeometrica;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        System.out.println("Círculo de lado 3:");
        System.out.println("Área: "+circulo.getArea());
        System.out.println("Circunferência: "+circulo.getCircunferencia());
        System.out.println("Diâmetro: "+circulo.getDiametro());
        System.out.println("Raio: "+circulo.getRaio());

        System.out.println("Quadrado de lado 2:");
        Quadrado quadrado = new Quadrado(2);
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: "+ quadrado.getArea());
        System.out.println("Lado: "+ quadrado.getLado());

        System.out.println("Retângulo de base 2 altura 3:");
        Retangulo retangulo = new Retangulo(2,3);

        System.out.println("Área: "+ retangulo.getArea());
        System.out.println("Perímetro: "+ retangulo.getPerimetro());
        System.out.println("Base: "+ retangulo.getBase());
        System.out.println("Altura: "+retangulo.getAltura());

        System.out.println("Triângulo de lados 2, 3, 5");
        Triangulo triangulo = Triangulo.newTriangulo(2, 3, 5);
        System.out.println("Triângulo de lados 3, 4, 5:");
        triangulo = Triangulo.newTriangulo(3, 4, 5);
        assert triangulo != null;
        System.out.println("Perímetro: "+triangulo.getPerimetro());
        System.out.println("Área: "+triangulo.getArea());
    }
}
