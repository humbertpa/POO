package vehiculo;

import java.util.Scanner;

public class vehiculo {

    private String Modelo = "Sin asignar";
    private int año = 1990;
    private Motor motor = null;
    private Persona conductor = null;
    private Rueda[] ruedas = new Rueda[4];
    private marcas marca;

    Scanner InputNum = new Scanner(System.in);
    Scanner InputString = new Scanner(System.in);


    public vehiculo() {
        crearVehiculo();
    }

    public vehiculo(marcas marca, String modelo, int año) {
        setMarca(marca);
        setModelo(modelo);
        setAño(año);
        crearVehiculo();
    }


    public void setMarca(marcas marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public void setAño(int año) {
        if (año >= 1900 && año <= 2021)
            año = año;
    }

    private cilindros setcilindros(int i) {
        switch (i) {
            case 3:
                return cilindros._3CILINDROS;
            case 4:
                return cilindros._4CILINDROS;
            case 5:
                return cilindros._5CILINDROS;
            case 6:
                return cilindros._6CILINDROS;
            case 8:
                return cilindros._8CILINDROS;
        }
        return cilindros._8CILINDROS;
    }
    public marcas getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public int getAño() {
        return año;
    }

    private void crearVehiculo() {
        System.out.println("Tamaño de la rueda en pulgadas: ");
        double rueda = InputNum.nextDouble();

        System.out.println("Numero de tornillos de la ruedas: ");
        int tornillos = InputNum.nextInt();

        System.out.println("Nombre: ");
        String nombre = InputString.nextLine();

        System.out.println("Apellido paterno: ");
        String apPat = InputString.nextLine();

        System.out.println("Apellido Materno: ");
        String apMat = InputString.nextLine();

        System.out.println("Edad: ");
        int Edad = InputNum.nextInt();

        System.out.println("Numero de cilindros: ");
        int cilindros = InputNum.nextInt();

        System.out.println("Medida en litros: ");
        double medidaenlitros = InputNum.nextDouble();

        System.out.println("Caballos de fuerza: ");
        int Hp = InputNum.nextInt();

        for (int i = 0; i < 4; i++) {
            ruedas[i] = new Rueda(rueda, tornillos);
        }

        conductor = new Persona(nombre, apPat, apMat, Edad);

        motor = new Motor(setcilindros(cilindros), medidaenlitros, Hp);
    }

    public void cambioDeRuedas(Rueda ruedaNueva) {
        for (int i = 0; i < 4; i++) {
            ruedas[i] = ruedaNueva;
        }
    }

    public Rueda getRuedas() {
        return ruedas[0];
    }

    public void cambioDeConductor(Persona conductorNuevo) {
        conductor = conductorNuevo;
    }

    public void vehiculoSinConductor() {
        conductor = null;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void cambioDeMotor(Motor motorNuevo) {
        motor = motorNuevo;
    }

    public Motor getMotor() {
        return motor;
    }

    public String toString() {
        return "{Marca: " + getMarca() + ", Modelo: " + getModelo() + ", año: " + getAño() + "\n" + motor.toString() + "\n" + ruedas[0].toString() +
                "\n" + conductor.toString();
    }
}