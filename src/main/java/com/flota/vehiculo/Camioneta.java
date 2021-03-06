package com.flota.vehiculo;

import com.flota.Constante.Constantes;
import com.flota.Ruta.Paquete;
import com.flota.Ruta.Ruta;

public class Camioneta extends Vehiculo {

    public Camioneta(Constantes constantes, ConductorConstante conductor, Paquete paquetes, Ruta ruta, int num_max_paquetes) {
        super(constantes, conductor, paquetes, ruta, num_max_paquetes);
    }
    @Override
    public void validarConductor(Constantes constantes) {
        super.validarConductor(constantes);
    }

    @Override
    public void realizarParada(Ruta paradas) {
        super.realizarParada(paradas);
    }
}
