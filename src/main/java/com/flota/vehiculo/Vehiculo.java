package com.flota.vehiculo;

import com.flota.Conductor.Conductor;
import com.flota.Constante.Constantes;
import com.flota.Ruta.Paquete;
import com.flota.Ruta.Ruta;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    public final int NUM_MAX_PAQUETES;
    private List<Paquete>paquetes = new ArrayList<Paquete>();
    private Constantes constantes;
    private Ruta ruta;
    private Conductor conductor;
    private String paradas = "Aquí tiene su paquete";
    public Vehiculo(Constantes licencia , Conductor conductor, Paquete paquetes, Ruta ruta, int num_max_paquetes){
        validarConductor(constantes);
        NUM_MAX_PAQUETES = num_max_paquetes;
        this.constantes = constantes;
        this.ruta = ruta;
        this.conductor = conductor;
        paquetes = paquetes;

    }



    public void validarConductor(Constantes constantes){
        constantes = getConstantes();
    }
    public void realizarRuta(){
        if(getRuta().equals(ruta));
    }


    public void realizarParada(Ruta paradas){
        System.out.println(this.paradas);;

    }

    public int getNUM_MAX_PAQUETES() {
        return NUM_MAX_PAQUETES;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public Constantes getConstantes() {
        return constantes;
    }

    public Ruta getRuta() {
        return ruta;
    }


}
