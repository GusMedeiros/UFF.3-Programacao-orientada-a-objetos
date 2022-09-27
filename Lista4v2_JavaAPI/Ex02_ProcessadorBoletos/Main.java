package Lista4v2_JavaAPI.Ex02_ProcessadorBoletos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura(LocalDate.of(2022, 6, 26),
                new BigDecimal(1500), "Gustavo");
        new Pagamento(fatura1, new Boleto("123",LocalDate.of(2022,6,26),
                new BigDecimal(500)));
        new Pagamento(fatura1, new Boleto("123",LocalDate.of(2022,6,26),
                new BigDecimal(400)));
        new Pagamento(fatura1, new Boleto("123",LocalDate.of(2022,6,26),
                new BigDecimal(600)));
        fatura1.imprimirFatura();
        System.out.println();
        Fatura fatura2 = new Fatura(LocalDate.of(2022, 6, 26),
                new BigDecimal(1500), "Vania");

        new Pagamento(fatura2, new Boleto("123",LocalDate.of(2022,6,26),
                new BigDecimal(1000)));
        new Pagamento(fatura2, new Boleto("123",LocalDate.of(2022,6,26),
                new BigDecimal(500)));
        new Pagamento(fatura2, new Boleto("123",LocalDate.of(2022,6,26),
                new BigDecimal(250)));
        fatura2.imprimirFatura();
        System.out.println();

        Fatura fatura3 = new Fatura(LocalDate.of(2022, 6, 26),
                new BigDecimal(2000), "Claudio");

        new Pagamento(fatura3, new Boleto("123",LocalDate.of(2022,6,26),
                new BigDecimal(500)));
        new Pagamento(fatura3, new Boleto("123",LocalDate.of(2022,6,26),
                new BigDecimal(400)));
    }
}
