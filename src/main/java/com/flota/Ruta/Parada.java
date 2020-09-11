package com.flota.Ruta;

import java.util.ArrayList;
import java.util.List;

public class Parada {
    private List<Paquete> paquetesParada =  new ArrayList<Paquete>();

    public void meterPaquetesParada(Paquete paquete){
        this.paquetesParada.add(paquete);
    }

    public Parada(List<Paquete> paquetesParada){
        this.paquetesParada = paquetesParada;

    }
    public List<Paquete> getPaquetesParada(){

        return paquetesParada;
    }
}
