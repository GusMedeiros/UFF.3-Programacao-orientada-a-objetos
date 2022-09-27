package Lista4v2_JavaAPI.Ex02_ProcessadorBoletos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pagamento {
    private BigDecimal valorPago;
    private LocalDate data;
    private String tipoPagamento;
    Pagamento(Fatura fatura, Boleto boleto){
        this.tipoPagamento = "BOLETO";
        this.data = boleto.getData();
        this.valorPago = boleto.getValorPago();
        fatura.addPagamento(this);
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public LocalDate getData() {
        return data;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }
}
