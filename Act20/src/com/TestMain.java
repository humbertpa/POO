package com;

import vehiculo.*;

public class TestMain {
    public static void main(String[] args) {

        vehiculo vehículo = new vehiculo(marcas.NISSAN, "Sentra", 2006);
        Rueda rueda = new Rueda(16, 5);
        Persona persona = new Persona("Humberto", "Peñuelas", "Almeida", 23);
        Motor motor = new Motor(cilindros._4CILINDROS, 2, 1);

        System.out.println(vehículo + "\n");
        System.out.println(vehículo.getRuedas() + "\n");

        vehículo.cambioDeConductor(persona);
        System.out.println(vehículo.getConductor() + "\n");
        System.out.println(vehículo + "\n");

        vehículo.cambioDeMotor(motor);
        System.out.println(vehículo.getMotor() + "\n");
        System.out.println(vehículo + "\n");

    }
}