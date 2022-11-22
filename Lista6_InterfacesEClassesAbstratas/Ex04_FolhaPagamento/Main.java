package Lista6_InterfacesEClassesAbstratas.Ex04_FolhaPagamento;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.getFuncionarios().add(new Assalariado(1200));
        empresa.getFuncionarios().add(new HoraExtra(1200, 100, 48));
        empresa.getFuncionarios().add(new Comissionado(1200, 120));

        for(int i=0; i<empresa.getFuncionarios().size(); i++){
            System.out.println("Funcionário "+ (i+1) +":");
            System.out.println(empresa.getFuncionarios().get(i).getSalario());
        }
    }
}
