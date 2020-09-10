package com.flota.vehiculo;

import com.flota.Conductor.Conductor;
import com.flota.Constante.Constantes;
import com.flota.Ruta.Paquete;
import com.flota.Ruta.Ruta;

public class Furgoneta extends Vehiculo{

    public Furgoneta(Constantes constantes, Conductor conductor, Paquete paquetes, Ruta ruta, int num_max_paquetes) {
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

    @Override
    public void realizarRuta() {
        super.realizarRuta();
    }


}
