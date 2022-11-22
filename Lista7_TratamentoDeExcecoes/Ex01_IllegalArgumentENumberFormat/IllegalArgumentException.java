package Lista7_TratamentoDeExcecoes.Ex01_IllegalArgumentENumberFormat;

public class IllegalArgumentException {
    public static double somarProbabilidades(double prob1, double prob2){
        if(prob1 < 0 || prob2 < 0)
            throw new java.lang.IllegalArgumentException("Probabilidades negativas não existem.");
        if(prob1 + prob2 > 1)
            throw new java.lang.IllegalArgumentException("A soma das probabilidades deu maior do que 100%.");
        return prob1 + prob2;
    }

    public static void main(String[] args) {
        double prob1 = 0.5;
        double prob2 = 0.6;
        System.out.println("Tentando somar 50% com 60%");
        System.out.println(somarProbabilidades(prob1, prob2));
    }
}
