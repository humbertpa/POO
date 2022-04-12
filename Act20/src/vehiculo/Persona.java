package vehiculo;

public class Persona{

    private String Nombre = "Sin asignar";
    private String apPat = "Sin asignar";
    private String apMat = "Sin asignar";
    private int Edad = 0;

    public Persona() {
    }

    public Persona(String nombre, String apPat, String apMat, int edad) {
        setNombre(nombre);
        setapPat(apPat);
        setapMat(apMat);
        setEdad(edad);
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setapPat(String apPat) {
        this.apPat = apPat;
    }
    public void setapMat(String apMat) {
        this.apMat = apMat;
    }
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100)
            Edad = edad;
    }

    public String getapPat() {
        return apPat;
    }
    public String getapMat() {
        return apMat;
    }
    public String getNombre() {
        return Nombre;
    }
    public int getEdad() {
        return Edad;
    }


    public String toString() {
        return ("{nombre:" + Nombre + " " + getapPat() + " " + getapMat()+ ", edad:" + Edad + "}");
    }

    public boolean equals(Object o) {
        if (o instanceof Persona) {
            return ((Persona) o).getapPat() == apPat &&
                    ((Persona) o).getapMat() == apMat &&
                    ((Persona) o).getNombre() == Nombre;
        } else
            return false;
    }
}