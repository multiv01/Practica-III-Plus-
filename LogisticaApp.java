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

import java.util.Scanner;
public class LogisticaApp {

    /**
     * @param args the command line arguments
     */
    
    static int meter(LogisticaControlContenedor control){
        int almacen;
        almacen = control.descargar();
        return almacen;
    }
    
    static int sacar (LogisticaControlContenedor control) {
        int almacen;
        almacen = control.cargar();
        return almacen;
    }
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int opcion, almacen;
        String funcion;
        LogisticaControlContenedor control = new LogisticaControlContenedor();
        
        do{
            System.out.println("_________________________________________________");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Introducir un camión.");
            System.out.println("2. Salir del progama.");
            System.out.println("Introduzca el número correspondiente:");
            opcion = Integer.parseInt(tec.nextLine());
            if (opcion==1){
                System.out.println(".................................................");
                System.out.println("¿Qué va a hacer? escriba m o s");
                funcion = tec.nextLine();
                if (funcion.equals("m")){
                    almacen = meter(control);
                    if (almacen == 0){
                        System.out.println("No hay espacio, espere.");
                    } else {
                        System.out.println("Ve al almacen: " + almacen);
                    }
                } else if (funcion.equals("s")){
                    almacen = sacar(control);
                    if (almacen == 0){
                        System.out.println("No hay contenedores, espere.");
                    } else {
                        System.out.println("Ve al almacen: " + almacen);
                    }
                } else {
                    System.out.println("¡ERROR! Función no válida. Inténtelo de nuevo.");
                }
                System.out.println(".................................................");
            } else if (opcion!=2){
                System.out.println("¡ERROR! Opción no válida. Inténtelo de nuevo.");
            }
            System.out.println("_________________________________________________");
        } while(opcion!=2);
    }
}
