package com.flota.Ruta;

import java.util.ArrayList;
import java.util.List;

public class Ruta {

    private List<Parada> paradas = new ArrayList<Parada>();

    public void meterPaquete(Parada parada) {
        this.paradas.add(parada);

    }

    public Ruta(Parada parada) {

    }

    public List<Parada> getParadas() {
        return paradas;
    }
}
