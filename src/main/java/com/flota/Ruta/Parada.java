package com.flota.Ruta;

import java.util.ArrayList;
import java.util.List;

public class Parada {
    private List<Paquete> paquetesCamion =  new ArrayList<Paquete>(10);

    public void meterPaquetesCamion(Paquete paquetesCamion){
        this.paquetesCamion.add(paquetesCamion);
    }

    public Parada(Ruta ruta){

    }
}
