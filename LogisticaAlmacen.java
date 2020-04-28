/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticaapp;

/**
 *
 * @author Inmaculada GraciaAbad
 */

public class LogisticaAlmacen {
    
    private int capacidad;
    private int ocupacion;
    
    public void setCapacidad(int espacio){
        capacidad = espacio;
    }
    public int getCapacidad(){
        return capacidad;
    }
    
    public void setOcupacion (int sitio){
        ocupacion = sitio;
    }
    public int getOcupacion(){
        return ocupacion;
    }
    
    public LogisticaAlmacen(int espacio){
        capacidad = espacio;
        ocupacion = 0;
    }
}
