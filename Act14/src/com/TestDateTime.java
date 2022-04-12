package com;

public class TestDateTime {
    public static void main(String[] args) {

        DateTime time1 = new DateTime();//fecha/hora actual.
        DateTime time2 = new DateTime(0, 26, 3); //hora 0:26:03 con la fecha actual.
        DateTime time3 = new DateTime(23, 59, 59, 31, 12, 2017); //hora 11:59:59 PM con fecha 31-Dic-2017.
        DateTime time4 = time3.clone();//segundo siguiente a time3.
        time4.next();
        Date date5 = new Date(2017, 12, 31);//fecha 31-Dic-2017.
        Date t6 = DateTime.toDate(time3);//fecha siguiente de time3 pero su misma hora.
        t6.nextDay();
        DateTime time6 = new DateTime(t6);
        time6.setHour(time3.getHour());
        time6.setMin(time3.getMin());
        time6.setSec(time3.getSec());

        System.out.println("time 1      "+time1.toString());
        System.out.println("time 2      "+time2.toString());
        System.out.println("time 3      "+time3.toString());
        System.out.println("time 4      "+time4.toString());
        System.out.println("date 5      "+date5.toString());
        System.out.println("time 6      "+time6.toString());

        /*
        Imprimir el resultado de comprar time2 y un clon de time2.
        Imprimir el resultado de comparar time3 y date5 en ambos sentidos.
        Imprimir el resultado de comparar la fecha de time3 y date5.
         */

        DateTime clon2 = time2.clone();
        System.out.println(time2.equals(clon2));
        System.out.println(time3.equals(date5));
        System.out.println(date5.equals(time3));

    }
}


