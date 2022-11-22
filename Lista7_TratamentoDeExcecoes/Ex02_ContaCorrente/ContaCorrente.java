package Lista7_TratamentoDeExcecoes.Ex02_ContaCorrente;

public class ContaCorrente {
    private float limite, saldo, valorLimite;

    ContaCorrente(float limite, float saldo, float valorLimite){
        this.limite = limite;
        this.saldo = saldo;
        this.valorLimite = valorLimite;
    }

    public void sacar(float valor){
        if(valor < 0)
            throw new IllegalArgumentException("Tentando sacar valores negativos. Use depósitar para isso.");
        this.saldo -= valor;
    }

    public void depositar(float valor){
        if(valor < 0)
            throw new IllegalArgumentException("Tentando depositar valores negativos. Use sacar para isso.");
        this.saldo += valor;

    }

    public void setValorLimite(float valor){
        if(valor < 0)
            throw new IllegalArgumentException("Limite negativo não existe.");
        this.valorLimite = valor;
    }
}
