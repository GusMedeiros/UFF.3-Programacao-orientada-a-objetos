package Lista2_introducao_classes.Ex01_pessoa_aniversario;

public class Main {
    public static void main(String[] args) {
        Pessoa gustavo = new Pessoa();
        gustavo.nomear("Gustavo");
        for(int i=0; gustavo.idade<21; i++){
            gustavo.fazer_aniversario();
        }
        System.out.println("A pessoa "+gustavo.nome+" tem "+ gustavo.idade+" anos de idade.");

    }
}
