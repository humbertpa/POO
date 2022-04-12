package com;

import java.util.Calendar;

public class DateTime {


    private int year;
    private int month;
    private int day;
    private int hour;
    private int min;
    private int sec;

    Calendar hoy = Calendar.getInstance();

    public DateTime(int hh, int mi, int ss, int dd, int mm, int yy) { //Asignar hora y fecha recibidas

        setYear(yy);
        setMonth(mm);
        setDay(dd);
        setHour(hh);
        setMin(mi);
        setSec(ss);
    }

    public DateTime(int hh, int mi, int ss) { //Asignar hora recibida y fecha actual

        setYear(hoy.get(Calendar.YEAR));
        setMonth(hoy.get(Calendar.MONTH)+1);
        setDay(hoy.get(Calendar.DAY_OF_MONTH));
        setHour(hh);
        setMin(mi);
        setSec(ss);
    }

    public DateTime() { //Asignar hora recibida y fecha actual

        setYear(hoy.get(Calendar.YEAR));
        setMonth(hoy.get(Calendar.MONTH)+1);
        setDay(hoy.get(Calendar.DAY_OF_MONTH));
        setHour(hoy.get(Calendar.HOUR));
        setMin(hoy.get(Calendar.MINUTE));
        setSec(hoy.get(Calendar.SECOND));
    }

    public DateTime(Date Date) { //Asigna hora actual y fecha recibida

        setYear(Date.getYear());
        setMonth(Date.getMonth());
        setDay(Date.getDay());
        setHour(hoy.get(Calendar.HOUR));
        setMin(hoy.get(Calendar.MINUTE));
        setSec(hoy.get(Calendar.SECOND));
    }


    //////////////////////
    //                  //
    //      setters     //
    //                  //
    //////////////////////
    public void setYear(int year) {
        this.year = year;

    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        if(hour>=0 & hour <=23) {
            this.hour = hour;
        }
    }

    public void setMin(int min) {
        if(min>=0 & min<=59) {
            this.min = min;
        }
    }

    public void setSec(int sec) {
        if(sec>=0 & sec<=59) {
            this.sec = sec;
        }
    }


    //////////////////////
    //                  //
    //      getters     //
    //                  //
    //////////////////////

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMin() {
        return this.min;
    }

    public int getSec() {
        return this.sec;
    }

    public void next() {
        if (getSec() != 59) {
            setSec(getSec() + 1);
        } else {
            setSec(0);
            if (getMin() != 59) {
                setMin(getMin() + 1);
            } else {
                setMin(0);
                if (getHour() != 23) {
                    setHour(getHour() + 1);
                } else {
                    setHour(0);
                    Date d1 = toDate(new DateTime(this.hour, this.min, this.sec, this.day, this.month, this.year));
                    d1.nextDay();
                    DateTime d2 = new DateTime(d1);
                    setMonth(d2.getMonth());
                    setDay(d2.getDay());
                    setYear(d2.getYear());
                }
            }
        }
    }

    public static Date toDate(DateTime t) {
        return new Date(t.getYear(), t.getMonth(), t.getDay());
    }

    public String toString() {
        return String.format("dd %02d / mm %02d / yy %4d  %02d:%02d:%02d", getDay(), getMonth(), getYear(), getHour(), getMin(), getSec());
    }

    public boolean equals(DateTime o) {
        if (o instanceof DateTime) {
            return o.getSec() == this.sec && o.getMin() == this.min & o.getHour() == this.hour && o.getDay() == this.day && o.getMonth() == this.month && o.getYear() == this.year;
        }else{return false;}
    }

    public DateTime clone() {

        return new DateTime(hour,min,sec,day,month,year);
    }
}