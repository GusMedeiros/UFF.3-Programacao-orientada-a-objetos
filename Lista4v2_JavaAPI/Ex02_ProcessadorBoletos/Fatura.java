package Lista4v2_JavaAPI.Ex02_ProcessadorBoletos;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class Fatura {
    private LocalDate data;
    private BigDecimal valorTotal;
    private String nomeCliente;
    private ArrayList<Pagamento> pagamentos;
    private boolean isPaga;

    Fatura(LocalDate data, BigDecimal valorTotal, String nomeCliente){
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        this.pagamentos = new ArrayList<>();
        this.isPaga = false;
    }

    public void addPagamento(Pagamento pagamento){
        pagamentos.add(pagamento);
        BigDecimal soma = new BigDecimal(0);
        for(Pagamento p:pagamentos){
            soma = soma.add(p.getValorPago());
        }
        if(soma.compareTo(this.valorTotal) >= 0) isPaga = true;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void imprimirFatura(){
        System.out.println("Data da fatura: "+data.getDayOfMonth()+"/"+data.getMonthValue()+"/"+data.getYear());
        System.out.println("Valor total:" + valorTotal);
        System.out.println("Nome do cliente: "+ nomeCliente);
        System.out.println("Pagamentos:");
        imprimirPagamentos();

        System.out.println("O pagamento da fatura está "+(this.isPaga?"PAGO.":"PENDENTE."));
    }

    public void imprimirPagamentos(){
        DecimalFormat df = new DecimalFormat("#.00");
        for(Pagamento p:pagamentos){
            System.out.println("Pagamento em "+ p.getTipoPagamento()+ " em "+
                    p.getData().getDayOfMonth()+"/"+p.getData().getMonthValue()+"/"+p.getData().getYear()
                    + " no valor de R$"+df.format(p.getValorPago()));
        }
    }

    public boolean isPaga() {
        return isPaga;
    }
}
