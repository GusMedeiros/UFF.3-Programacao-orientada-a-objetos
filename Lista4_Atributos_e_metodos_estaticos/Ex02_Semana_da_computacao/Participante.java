package Lista4_Atributos_e_metodos_estaticos.Ex02_Semana_da_computacao;

import java.util.ArrayList;

public class Participante {
    private String matricula, nome, email;
    ArrayList<Palestra> palestras = new ArrayList<Palestra>();

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

    public String getMatricula() {
        return matricula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Participante(String nome, String matricula, String email){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }
}
