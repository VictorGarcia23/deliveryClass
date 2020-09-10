package com.flota.vehiculo;

import com.flota.Constante.Constantes;
import com.flota.Ruta.Paquete;
import com.flota.Ruta.Ruta;

public class CamionArticulado extends Vehiculo{

    public CamionArticulado(Constantes constantes, ConductorConstante conductor, Paquete paquetes, Ruta ruta, int num_max_paquetes) {
        super(constantes, conductor, paquetes, ruta, num_max_paquetes);
    }
}
