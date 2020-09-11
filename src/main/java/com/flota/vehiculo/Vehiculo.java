package com.flota.vehiculo;

import com.flota.Conductor.Conductor;
import com.flota.Constante.Constantes;
import com.flota.Ruta.Paquete;
import com.flota.Ruta.Parada;
import com.flota.Ruta.Ruta;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    public int numMaxPaquetes;
    private List<Paquete>paquetesVehiculo = new ArrayList<Paquete>();

    private Ruta ruta;
    private Conductor conductor;
    private Constantes.Licencia licencia;

    public Vehiculo(Constantes.Licencia licencia , Conductor conductor,List<Paquete> paquetes, Ruta ruta, int numMaxPaquetes){
        this.numMaxPaquetes = numMaxPaquetes;
        this.licencia = licencia;
        this.ruta = ruta;
        this.conductor = conductor;
        this.paquetesVehiculo = paquetes;

    }



    public boolean validarConductor(Constantes.Licencia licenciaConductor, Constantes.Licencia licenciaVehiculo){
        if(licenciaConductor.equals(Constantes.Licencia.D)){
            return true;
            }
        if (licenciaConductor.equals(Constantes.Licencia.C) && licenciaVehiculo != Constantes.Licencia.D) {
            return true;
            }
        if(licenciaConductor.equals(Constantes.Licencia.B) && licenciaVehiculo == Constantes.Licencia.B){
            return true;
            }
            return false;
    }
     public void realizarRuta(){
        if(validarConductor(this.conductor.getLicencia(),this.licencia)){
            for (int i = 0; i <this.ruta.getParadas().size() ; i++) {
                Parada parada = this.ruta.getParadas().get(i);
                for (int j = 0; j < parada.getPaquetesParada().size() ; j++) {
                    Paquete paquete = parada.getPaquetesParada().get(j);
                    System.out.println("Paquete entregado " + paquete.getNombre());
                    this.paquetesVehiculo.remove(paquete);
                }
            }
        }
    }
// COMPROBAR QUE EL PAQUETE ESTÁ DENTRO DEL CAMIÓN



}
