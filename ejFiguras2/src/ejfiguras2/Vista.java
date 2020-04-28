/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejfiguras2;
import java.awt.Color;
/**
 *
 * @author Adrián Torralba Gómez
 */
public class Vista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionFiguras controlador=new GestionFiguras();
        controlador.insertarFigura(new Rectangulo(Color.BLUE,2d,5d,3d,5d));
        controlador.insertarFigura(new Circulo(Color.red,4d,5d,3d));
        controlador.insertarFigura(new Rectangulo(3d,6d,10d,12d));
        controlador.insertarFigura(new Circulo(42d,35d,4d));
        controlador.listar();
        System.out.println(".....................................");
        System.out.println("Están en orden: "+controlador.estanEnOrden());
        
        // TODO code application logic here
    }
    
}
