package com;

import Dispositivos.Dispositivos;
import Dispositivos.TelefonoMovil;

public class TestExam2 {
    public static void main(String[] args) {
        TelefonoMovil telefono = new TelefonoMovil(Dispositivos.Samsung, 15, Dispositivos.Android,false, 3500, 37,true );
        telefono.llamar("Jesus");
        telefono.instalarApp("instalar");
        telefono.instalarApp("desinstalar");
    }
}
