package Lista3_estrutura_de_construtores_e_encapsulamento.Ex03_Data;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(365, 2022);
        data1.imprimir();
        Data data2 = new Data(31, 12, 2022);
        data2.imprimir();
        Data data3 = new Data("Dezembro", 31, 2022);
        data3.imprimir();
    }

}
