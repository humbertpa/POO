enum Dia {
    LUNES("Lundi", "Monday", "Lunes"),
    MARTES("Mardi", "Tuesday", "Martes"),
    MIERCOLES("Mercredi", "Wednesday", "Miercoles"),
    JUEVES("Jeudi", "Thursday", "Jueves"),
    VIERNES("Vendredi", "Friday", "Viernes"),
    SABADO("Samedi", "Saturday", "Sabado"),
    DOMINGO("Dimanche", "Sunday", "Domingo");

    private String jour, day, dia;
    private String tag=dia;
    public Idioma lang= Idioma.ESPAÑOL;

    Dia(String frances, String ingles, String español) {
        this.jour = frances;
        this.day = ingles;
        this.dia = español;
    }

    void cambiarIdioma(Idioma lang){
        this.lang=lang;
    }

    public String toString() {
        if(lang==Idioma.ESPAÑOL)return dia;
        if(lang==Idioma.INGLES)return day;
        if(lang==Idioma.FRANCES)return jour;
        return null;
    }

    public void printSemana() {
            System.out.println(LUNES.dia + ", " + MARTES.dia + ", " + MIERCOLES.dia + ", " + JUEVES.dia + ", " + VIERNES.dia + ", " + SABADO.dia + ", " + DOMINGO.dia+"\n"+LUNES.day + ", " + MARTES.day + ", " + MIERCOLES.day + ", " + JUEVES.day + ", " + VIERNES.day + ", " + SABADO.day + ", " + DOMINGO.day+"\n"+
                    LUNES.jour + ", " + MARTES.jour + ", " + MIERCOLES.jour + ", " +JUEVES.jour + ", " + VIERNES.jour + ", " + SABADO.jour + ", " + DOMINGO.jour);
    }

}