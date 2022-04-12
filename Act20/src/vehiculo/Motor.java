package vehiculo;

public class Motor {
    private cilindros cilindros;
    private double cilindrada = 4;
    private int potencia = 100;

    public Motor() {
    }

    public Motor(cilindros cilindros, double cilindrada, int potencia) {
        setCilindros(cilindros);
        setCilindrada(cilindrada);
        setPotencia(potencia);
    }

    public void setCilindros(cilindros cilindros) {
        this.cilindros = cilindros;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public cilindros getCilindros() {
        return cilindros;
    }
    public double getCilindrada() {
        return cilindrada;
    }
    public int getPotencia() {
        return potencia;
    }

    public String toString() {
        return "Motor{" +
                "cilindros=" + cilindros +
                ", cilindrada=" + cilindrada +
                ", potencia=" + potencia +
                '}';
    }

}