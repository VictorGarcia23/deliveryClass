package com.flota.Ruta;

import java.util.ArrayList;
import java.util.List;

public class Ruta {

    private List<Parada>paradas = new ArrayList<Parada>(10);
        public void meterPaquete(Parada parada){
            this.paradas.add(parada);

        }
    public Ruta (Paquete paquete){

    }
}
