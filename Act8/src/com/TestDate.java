package com;
import java.util.Calendar;

public class TestDate {
    public static void main(String[] args){
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();
        d2.set(2020, Calendar.SEPTEMBER, 23);
        Calendar d3;

        if (d1.before(d2)) {
            d3 = d1;
        }else{
            d3=d2;
        }

        System.out.println("la fecha mas antigua es :\nAño: " + d3.get(Calendar.YEAR) + " Mes: " + (d3.get(Calendar.MONTH) + 1) + " Dia: " + d3.get(Calendar.DAY_OF_MONTH));

        d1.add(Calendar.DATE, 14); d1.add(Calendar.YEAR, -4);
        System.out.println("Dos semanas más cuatro años menos\nAño: " + d1.get(Calendar.YEAR) + " Mes: " + (d1.get(Calendar.MONTH) + 1) + " Dia: " + d1.get(Calendar.DAY_OF_MONTH));

        Calendar t1 = Calendar.getInstance();
        System.out.println("hora actual: "+t1.get(Calendar.HOUR_OF_DAY) + "h :" + t1.get(Calendar.MINUTE) + "m :" + t1.get(Calendar.SECOND)+"s");

        Calendar dt1 = Calendar.getInstance();
        dt1.set(d2.get(Calendar.YEAR), d2.get(Calendar.MONTH), d2.get(Calendar.DAY_OF_MONTH), d1.get(Calendar.HOUR_OF_DAY), d1.get(Calendar.MINUTE), d1.get(Calendar.SECOND));
        System.out.println(dt1.getTime());
        System.out.println("Dia: " + dt1.get(Calendar.DAY_OF_MONTH) + " Mes: " + (dt1.get(Calendar.MONTH) + 1) + " Año: "+ dt1.get(Calendar.YEAR) + "\nHora: " + dt1.get(Calendar.HOUR_OF_DAY) + ":" + dt1.get(Calendar.MINUTE) + ":" + dt1.get(Calendar.SECOND));

    }
}
