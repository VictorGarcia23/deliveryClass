package com.flota.Conductor;

import com.flota.Constante.Constantes;
import com.flota.Constante.Constantes.Licencia;

public class Conductor {
    private Licencia licencia;
    public Conductor(Licencia licencia) {
        this.licencia = licencia;
    }

    public Licencia getLicencia() {
        return licencia;
    }
}
