package Lista6_InterfacesEClassesAbstratas.Ex05_SistemaEmpresa;

public interface Recebivel extends Comparable<Recebivel>{
    public String getDescricao();
    public double totalizarReceita();
}
