package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataModel {

    //começa com letras maiusculas = Objetos
    public LocalDate getDataAtual() {
        Date dataAtual = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dataf = df.format(dataAtual);
        String[] datafSplit = dataf.split("/");
        int dia = Integer.parseInt(datafSplit[0]);
        int mes = Integer.parseInt(datafSplit[1]);
        int ano = Integer.parseInt(datafSplit[2]);
        LocalDate dataAtualFormat = LocalDate.of(ano, mes, dia);
        //String dataAtualFormatUser = df.format(dataAtualFormat);
        return dataAtualFormat;
    }

    public int getQuantidadeDiasByMes(int mes) {
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.set(Calendar.MONTH, mes - 1);
        int quantidadeDias = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
        return quantidadeDias;
        //for(int i=0 )

    }

    public LocalDate getDataDevolucao(LocalDate retirada) {
        int quantidadeDias = getQuantidadeDiasByMes(retirada.getMonthValue());
        int countDayRest = 0;
        int dayCurrent = retirada.getDayOfMonth();
        //Estamos fazendo um teste com < sozinho.
        for (int i = dayCurrent; i < quantidadeDias; i++) {
            countDayRest++;
        }
        LocalDate dataDevolucao = null;
        if (countDayRest >= 7) {
            dataDevolucao = LocalDate.of(retirada.getYear(), retirada.getMonthValue(), retirada.getDayOfMonth() + 7);
        } else {
            dataDevolucao = LocalDate.of(retirada.getYear(), retirada.getMonthValue() + 1, 7 - countDayRest);
        }
        return dataDevolucao;

    }
    
    public LocalDate convertDateForLocalDate (Date dt){
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String dataf = df.format(dt);
        String[] datafSplit = dataf.split("-");
        int dia = Integer.parseInt(datafSplit[0]);
        int mes = Integer.parseInt(datafSplit[1]);
        int ano = Integer.parseInt(datafSplit[2]);
        LocalDate dtFormat = LocalDate.of(ano, mes, dia);
        return dtFormat;
    
    }

}
