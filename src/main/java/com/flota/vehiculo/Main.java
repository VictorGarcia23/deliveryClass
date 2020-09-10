package com.flota.vehiculo;

import com.flota.Conductor.Conductor;
import com.flota.Constante.Constantes.Licencia;
import com.flota.Ruta.Paquete;
import com.flota.Ruta.Parada;

public class Main {
    public static void main(String[] args) {
        Conductor conductor = new Conductor(Licencia.B);
        Vehiculo vehiculo = new Vehiculo(Licencia.valueOf())
        Parada parada = new Parada(Paquete);
        parada.meterPaquetesCamion(parada);

    }
}
