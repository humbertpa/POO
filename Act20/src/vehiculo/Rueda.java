package vehiculo;

public class Rueda {
    private double pulgadas=15;
    private  int numTornillos=4;

    public Rueda(){}

    public Rueda(double pulgadas, int numTornillos){
        setPulgadas(pulgadas);
        setNumTornillos(numTornillos);
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }
    public void setNumTornillos(int numTornillos) {
        this.numTornillos = numTornillos;
    }

    public double getPulgadas() {
        return pulgadas;
    }
    public int getNumTornillos() {
        return numTornillos;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "pulgadas=" + pulgadas +
                ", numTornillos=" + numTornillos +
                '}';
    }
}
