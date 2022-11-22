package Lista6_InterfacesEClassesAbstratas.Ex05_SistemaEmpresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RegistroRecebimentos{
    ArrayList<Recebivel> registros = new ArrayList<>();
    public void imprimirRegistros(){
        System.out.println("Lista de registros:");
        for(Recebivel r:registros){
            System.out.println(r.toString());
        }
    }

    public void sort(){
        Collections.sort(registros, new Comparator<Recebivel>(){

            @Override
            public int compare(Recebivel o1, Recebivel o2){
                return o1.getDescricao().compareTo(o2.getDescricao());
            }
        });
    }

    public void addRegistro(Recebivel reg){
        registros.add(reg);
    }

    public static void main(String[] args) {
        RegistroRecebimentos r = new RegistroRecebimentos();
        r.addRegistro(new Servico("Limpeza", 1, 75));
        r.addRegistro(new ItemVenda("Cooler", 5, 14));
        r.addRegistro(new ItemVenda("Gabinete",1, 95));

        r.sort();
        r.imprimirRegistros();
    }
}
