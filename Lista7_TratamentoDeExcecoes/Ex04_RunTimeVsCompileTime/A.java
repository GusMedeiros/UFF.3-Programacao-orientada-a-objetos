package Lista7_TratamentoDeExcecoes.Ex04_RunTimeVsCompileTime;

public class A {

    /*
    Resposta:
    O método B, da maneira que aqui está, repassa a exceção para quem o chamou. Portanto, quem o chamou só
    poderá compilar se estiver dentro de um bloco try catch.


    O método C poderá ser compilado mesmo sem try catch, mas jogará a ExcecaoNaoVerificada em tempo de execução, caso
    não esteja num bloco try catch.

    O método A, portanto, só poderá compilar dentro de um bloco try catch, do contrário jogará a ExcecaoVerificada em
    tempo de compilação. Como o try catch detectará sempre a ExcecaoVerificada primeiro, o método C nunca será chamado.
     */
    public static class ExcecaoVerificada extends Exception{
        ExcecaoVerificada(String s){
            super(s);
        }
    }
    public static class ExcecaoNaoVerificada extends RuntimeException{
        ExcecaoNaoVerificada(String s){
            super(s);
        }
    }

    public static void main(String[] args) {
        try {
            metodoA();
        }
        catch(ExcecaoVerificada a){
            System.out.println("Exceção detectada: "+ a.getMessage());
        }
    }

    public static void metodoA() throws ExcecaoVerificada, ExcecaoNaoVerificada{
        metodoB();
        metodoC();
    }

    public static void metodoB() throws ExcecaoVerificada{
        lancaExcecaoVerificada();
    }

    public static void metodoC(){
        lancaExcecaoNaoVerificada();
    }

    public static void lancaExcecaoVerificada() throws ExcecaoVerificada {
        throw new ExcecaoVerificada("Exceção verificada");
    }

    public static void lancaExcecaoNaoVerificada(){
        throw new ExcecaoNaoVerificada("Exceção NÃO verificada");
    }
}
