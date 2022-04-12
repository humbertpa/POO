public class TestAct21 {
    public static void main(String[] args) {

        Dia d1 = Dia.MIERCOLES;
        System.out.println(d1);
        d1.cambiarIdioma(Idioma.INGLES);
        System.out.println(d1);

        Dia d2 = Dia.SABADO;
        System.out.println(d2);
        d2.cambiarIdioma(Idioma.FRANCES);
        System.out.println(d2);


        d1.printSemana();
    }
}
