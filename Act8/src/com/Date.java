package com;
import java.util.Calendar;


public class Date {

    public static final int ENERO = 1;
    public static final int FEBRERO = 2;
    public static final int MARZO = 3;
    public static final int ABRIL = 4;
    public static final int MAYO = 5;
    public static final int JUNIO = 6;
    public static final int JULIO = 7;
    public static final int AGOSTO = 8;
    public static final int SEPTIEMBRE = 9;
    public static final int OCTUBRE = 10;
    public static final int NOVIEMBRE = 11;
    public static final int DICIEMBRE = 12;
    public static final int DOMINGO = 0;
    public static final int LUNES = 1;
    public static final int MARTES = 2;
    public static final int MIERCOLES = 3;
    public static final int JUEVES = 4;
    public static final int VIERNES = 5;
    public static final int SABADO = 6;
    private final int diaInic;
    private final int mesInic;
    private final int añoInic;

    private int day = 0;
    private int month = 0;
    private int year = -1;
    private String mes;
    static private int instancias = 0;

    Calendar CurrentDate = Calendar.getInstance();//actividad 13

    public Date(int year, int month, int day) {
        setDay(day);
        setMonth(month);
        setYear(year);
        setMes(month);

        if (isValid()) {
            this.diaInic = getDay();
            this.mesInic = getMonth();
            this.añoInic = getYear();
        } else {
            this.diaInic = 1;
            this.mesInic = 1;
            this.añoInic = 0;
        }
        instancias++;
    }

    public Date() {
        setMes(CurrentDate.get(Calendar.MONTH) + 1);
        day = CurrentDate.get(Calendar.DAY_OF_MONTH);
        month = CurrentDate.get(Calendar.MONTH) + 1;
        year = CurrentDate.get(Calendar.YEAR);
        this.diaInic = day;
        this.mesInic = month;
        this.añoInic = year;
        instancias++;
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31)
            this.day = day;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12)
            this.month = month;
    }

    public void setMes(int month) {
        if (month > 0 && month <= 12)
            switch (month) {
                case ABRIL:
                    this.mes = "Abril";
                    break;
                case JUNIO:
                    this.mes = "Junio";
                    break;
                case SEPTIEMBRE:
                    this.mes = "Septiembre";
                    break;
                case NOVIEMBRE:
                    this.mes = "Noviembre";
                    break;
                case ENERO:
                    this.mes = "Enero";
                    break;
                case MARZO:
                    this.mes = "Marzo";
                    break;
                case MAYO:
                    this.mes = "Mayo";
                    break;
                case JULIO:
                    this.mes = "Julio";
                    break;
                case AGOSTO:
                    this.mes = "Agosto";
                    break;
                case OCTUBRE:
                    this.mes = "Octubre";
                    break;
                case DICIEMBRE:
                    this.mes = "Diciembre";
                    break;
                case FEBRERO:
                    this.mes = "Febrero";
                    break;
                default:
                    this.mes = "";
                    break;
            }
    }

    public void setYear(int year) {
        if (year >= 0 && year <= 9999)
            this.year = year;
    }

    public boolean esBis() {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public String getMes() {
        return mes;
    }

    public int getYear() {
        return year;
    }

    public boolean isValid() {
        if (year == -1) {
            return false;
        }
        if (day == 0) {
            return false;
        }
        switch (month) {
            case ABRIL:
            case JUNIO:
            case SEPTIEMBRE:
            case NOVIEMBRE:
                if (day <= 30) {
                    return true;
                } else {
                    return false;
                }
            case ENERO:
            case MARZO:
            case MAYO:
            case JULIO:
            case AGOSTO:
            case OCTUBRE:
            case DICIEMBRE:
                if (day <= 31) {
                    return true;
                } else {
                    return false;
                }
            case FEBRERO:
                if (esBis() == true) {
                    if (day <= 29) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    if (day < 29) {
                        return true;
                    } else {
                        return false;
                    }
                }
            default:
                return false;
        }
    }

    public String toString() {
        if (isValid()) {
            return String.format("day: %2d, month: %2d, year: %4d, monthname: %s", getDay(), getMonth(), getYear(), getMes());
        } else {
            return "La fecha es inválida";
        }
    }

    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date d = (Date) o;
            return d.getDay() == this.day & d.getMonth() == this.month & d.getYear() == this.year;
        } else
            return false;
    }

    public Date clone() {
        return new Date(year, month, day);
    }

    public String nextDay() {
        if (isValid()) {
            this.day++;
            if (!isValid()) {
                setDay(1);
                setMonth(this.month + 1);
                setMes(this.month);
                if (getMonth() == 12) {
                    setMonth(1);
                    setMes(1);
                    setYear(this.year + 1);
                }
            }
            return String.format("day: %2d, month: %2d, year: %4d, monthname: %s", getDay(), getMonth(), getYear(), getMes());
        } else {
            return "La fecha es inválida";
        }
    }

    public String previousDay() {
        if (isValid()) {
            this.day--;
            if (!isValid()) {
                switch (month - 1) {
                    case (4):
                    case (6):
                    case (9):
                    case (11):
                        this.day = 30;
                        break;
                    case (1):
                    case (3):
                    case (5):
                    case (7):
                    case (8):
                    case (10):
                    case (0):
                        this.day = 31;
                        break;
                    case (2):
                        if (esBis()) {
                            this.day = 29;
                        } else {
                            this.day = 28;
                        }
                        break;
                    default:
                        break;
                }
                this.month--;
                if (this.month == 0) {
                    setMonth(12);
                    setMes(12);
                    setYear(this.year - 1);
                } else {
                    setMes(this.month);
                }
            }
            return String.format("day: %2d, month: %2d, year: %4d, monthname: %s", getDay(), getMonth(), getYear(), getMes());
        } else {
            return "La fecha es inválida";
        }
    }

    //tarea 12

    public static int getInstances() {
        return instancias;
    }

    public static boolean isLeap(int año) {
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int year, int month, int day) {
        if (day > 0 && day <= 31 && month > 0 && month <= 12 && year >= 0 && year <= 9999) {
            switch (month) {
                case ABRIL:
                case JUNIO:
                case SEPTIEMBRE:
                case NOVIEMBRE:
                    if (day <= 30) {
                        return true;
                    } else {
                        return false;
                    }
                case ENERO:
                case MARZO:
                case MAYO:
                case JULIO:
                case AGOSTO:
                case OCTUBRE:
                case DICIEMBRE:
                    if (day <= 31) {
                        return true;
                    } else {
                        return false;
                    }
                case FEBRERO:
                    if (isLeap(year) == true) {
                        if (day <= 29) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        if (day < 29) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                default:
                    return false;
            }
        } else {
            return false;
        }
    }

    public static String DayOfWeek(int year, int month, int day) {
        int x = 0;
        int d;
        if (isLeap(year)) {
            switch (month) {
                case ENERO:
                    x = 0;break;
                case FEBRERO:
                    x = 3;break;
                case MARZO:
                    x = 4;break;
                case ABRIL:
                    x = 0;break;
                case MAYO:
                    x = 2;break;
                case JUNIO:
                    x = 5;break;
                case JULIO:
                    x = 0;break;
                case AGOSTO:
                    x = 3;break;
                case SEPTIEMBRE:
                    x = 6;break;
                case OCTUBRE:
                    x = 1;break;
                case NOVIEMBRE:
                    x = 4;break;
                default:
                    x = 6;break;
            }
        } else {
            switch (month) {
                case ENERO:
                    x = 0;break;
                case FEBRERO:
                    x = 3;break;
                case MARZO:
                    x = 3;break;
                case ABRIL:
                    x = 6;break;
                case MAYO:
                    x = 1;break;
                case JUNIO:
                    x = 4;break;
                case JULIO:
                    x = 6;break;
                case AGOSTO:
                    x = 2;break;
                case SEPTIEMBRE:
                    x = 5;break;
                case OCTUBRE:
                    x = 0;break;
                case NOVIEMBRE:
                    x = 3;break;
                default:
                    x = 5;
            }
        }
        d = ((year - 1) % 7 + ((year - 1) / 4 - (3 * ((year - 1) / 100 + 1) / 4)) % 7 + x + day % 7) % 7;
        switch (d) {
            case DOMINGO:
                return "domingo";
            case LUNES:
                return "lunes";
            case MARTES:
                return "martes";
            case MIERCOLES:
                return "miercoles";
            case JUEVES:
                return "jueves";
            case VIERNES:
                return "viernes";
            default:
                return "sabado";
        }
    }
}