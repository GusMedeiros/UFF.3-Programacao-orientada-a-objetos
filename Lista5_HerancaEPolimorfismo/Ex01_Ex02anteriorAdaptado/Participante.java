package Lista5_HerancaEPolimorfismo.Ex01_Ex02anteriorAdaptado;

import java.util.ArrayList;

public class Participante {
    private String nome, email;
    private ArrayList<Palestra> palestras = new ArrayList<Palestra>();

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void addPalestra(Palestra palestra){
        palestras.add(palestra);
    }

    public ArrayList<Palestra> getPalestras(){
        return palestras;
    }

    public void printPalestras(){
        System.out.println(this.nome+" está inscrito(a) na(s) seguinte(s) palestra(s):");
        for(Palestra p:palestras){
            System.out.println(p.getTitulo());
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Participante(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
}
