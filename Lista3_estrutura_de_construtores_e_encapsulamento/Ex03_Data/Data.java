package Lista3_estrutura_de_construtores_e_encapsulamento.Ex03_Data;

import java.util.Arrays;

public class Data {
    private int dia, mes, ano;
    private static final int[] meses_sem_31 = {2, 4, 6, 9, 11};
    private static final int[] dias_meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    Data(int dia, int mes, int ano) {
        set_DD_MM_AA(dia, mes, ano);
    }

    Data(String mes, int dia, int ano){
        set_DD_MM_AA(dia, mes_extenso_pra_numero(mes), ano);
    }

    Data(int dia, int ano){
        set_DD_MM_AA(ddd_to_dd(dia), ddd_to_mm(dia), ano);
    }

    public static boolean mes_tem_31(int mes){
        return (Arrays.binarySearch(meses_sem_31, mes) < 0);
    }
    public void set_DD_MM_AA(int dia, int mes, int ano){
        if(!(dia > 0 && dia <= 31)){
            throw new IllegalArgumentException(Integer.toString(dia));
        }
        this.dia = dia;
        if(!(dia <= 28 || mes != 2 && dia <= 30 || mes_tem_31(mes))){
            throw new IllegalArgumentException(Integer.toString(dia)+"/"+Integer.toString(mes));
        }
        this.mes = mes;

        if(ano < 0){
            throw new IllegalArgumentException(Integer.toString(ano));
        }
        this.ano = ano;
    }
    public static int mes_extenso_pra_numero(String mes){
        return switch (mes) {
            case "Janeiro" -> 1;
            case "Fevereiro" -> 2;
            case "Março" -> 3;
            case "Abril" -> 4;
            case "Maio" -> 5;
            case "Junho" -> 6;
            case "Julho" -> 7;
            case "Agosto" -> 8;
            case "Setembro" -> 9;
            case "Outubro" -> 10;
            case "Novembro" -> 11;
            case "Dezembro" -> 12;
            default -> -1;
        };
    }

    public static String mes_numero_pra_extenso(int mes){
        return switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> null;
        };
    }

    public static int ddd_to_dd(int dia){
        if(!(dia > 0 && dia <= 365)){
            throw new IllegalArgumentException(Integer.toString(dia));
        }
        for(int dias_mes: dias_meses){
            if(dia > dias_mes) dia -= dias_mes;
        }

        return dia;
    }

    public static int ddd_to_mm(int dia){
        if(!(dia > 0 && dia <= 365)) {
            throw new IllegalArgumentException(Integer.toString(dia));
        }
        int contador = 1;
        for(int i=0; i<11; i++){
            if(dia > dias_meses[i]){
                contador++;
                dia -= dias_meses[i];
            }
        }
        return contador;
    }

    public void imprimir(){
        System.out.println(dia +"/"+mes+"/"+ano);
    }



}
