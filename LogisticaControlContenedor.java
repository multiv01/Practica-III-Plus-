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

public class LogisticaControlContenedor {
    
    private LogisticaAlmacen [] almacenes = new LogisticaAlmacen[3];
    LogisticaAlmacen almacen1 = new LogisticaAlmacen(2);
    LogisticaAlmacen almacen2 = new LogisticaAlmacen(4);
    LogisticaAlmacen almacen3 = new LogisticaAlmacen(8); 
    
    public int descargar () {
        int nalmacen = 0;
        int capacidad, ocupacion;
        boolean encontrado=false;
        for (int i=0; i<almacenes.length; i++){
            capacidad = almacenes[i].getCapacidad();
            ocupacion = almacenes[i].getOcupacion();
            if (encontrado==false && ocupacion<capacidad){
                nalmacen = i + 1;
                encontrado = true;
                ocupacion++;
                almacenes[i].setOcupacion(ocupacion);
            }
        }
        return nalmacen;
    }
    
    public int cargar(){
        int nalmacen = 0;
        int ocupacion;
        boolean encontrado = false;
        for (int i = 0; i<almacenes.length; i++){
            ocupacion = almacenes[i].getOcupacion();
            if (encontrado==false && ocupacion!=0){
                nalmacen = i + 1;
                encontrado = true;
                ocupacion--;
                almacenes[i].setOcupacion(ocupacion);
            }
        }
        return nalmacen;
    }
    
    public LogisticaControlContenedor(){
        almacenes[0]=almacen1;
        almacenes[1]=almacen2;
        almacenes[2]=almacen3;
    }
}
