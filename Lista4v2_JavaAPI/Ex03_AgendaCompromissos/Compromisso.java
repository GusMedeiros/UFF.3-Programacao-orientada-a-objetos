package Lista4v2_JavaAPI.Ex03_AgendaCompromissos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Compromisso implements Comparable<Compromisso>{
    private String local;
    private String titulo;
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    Compromisso(String titulo, String local, LocalDate data){
        this.titulo = titulo;
        this.local = local;
        this.data = data;
    }

    public int compareTo(Compromisso o2) {
        return this.data.compareTo(o2.data);
    }

    public void imprimirCompromisso(Locale locale){
        DateTimeFormatter formato;
        if(locale.equals(new Locale("pt-br"))){
            formato = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", locale);
        }
        else{
            String following;
            if(data.getDayOfMonth()>=4) following = "th";
            else if(data.getDayOfMonth() == 3) following = "rd";
            else if(data.getDayOfMonth() == 2) following = "nd";
            else following = "st";
            formato = DateTimeFormatter.ofPattern("MMMM dd'"+following+"', yyyy", locale);
        }
        System.out.println("===================");
        System.out.println(titulo);
        System.out.println("Local: "+ local);
        System.out.println("Data: "+ formato.format(data));
    }

    public String getTitulo() {
        return titulo;
    }
}
