
public class ExcepcionRango extends RuntimeException {

    ExcepcionRango(int i) {
        super("Numerofueraderango");
        System.out.println("Numero fuera de rango: " + i);
    }
    
}