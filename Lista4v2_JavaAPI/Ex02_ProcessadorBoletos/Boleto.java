package Lista4v2_JavaAPI.Ex02_ProcessadorBoletos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Boleto {
    String codigo;
    LocalDate data;
    BigDecimal valorPago;

    Boleto(String codigo, LocalDate data, BigDecimal valorPago){
        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;
    }
    public BigDecimal getValorPago() {
        return valorPago;
    }

    public LocalDate getData() {
        return data;
    }

    public String getCodigo() {
        return codigo;
    }
}
