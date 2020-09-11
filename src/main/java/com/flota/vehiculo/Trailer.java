package com.flota.vehiculo;

import com.flota.Conductor.Conductor;
import com.flota.Constante.Constantes;
import com.flota.Ruta.Paquete;
import com.flota.Ruta.Ruta;

import java.util.List;

public class Trailer extends Vehiculo {


    public Trailer(Constantes.Licencia licencia, Conductor conductor, List<Paquete> paquetes, Ruta ruta, int numMaxPaquetes) {
        super(licencia, conductor, paquetes, ruta, numMaxPaquetes);
    }
}
