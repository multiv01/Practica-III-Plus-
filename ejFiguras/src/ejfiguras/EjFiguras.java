/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejfiguras;
import java.awt.Color;
/**
 *
 * @author Adrián Torralba Gómez
 */
public class EjFiguras {

    /**
     * @param args the command line arguments
     */
    
    public static boolean estanEnOrden(Figuras[] vec){
        boolean ordenadas = true;
        double areaAnt = 0, areaAct = 0;
        for(int i=0; i < vec.length; i++){
            areaAct = vec[i].area();
            if(areaAnt < areaAct){
                areaAnt = areaAct;
            }else{
                ordenadas = false;
            }
        }
        return ordenadas;
    }
    
    
    public static void main(String[] args) {
        Figuras[] vec=new Figuras[4];
        vec[0]=new Circulo(Color.red,4d,5d,3d);
        vec[1]=new Rectangulo(3d,6d,10d,12d);
        vec[2]=new Rectangulo(Color.BLUE,2d,5d,3d,5d);
        vec[3]=new Circulo(42d,35d,4d);
        for(int i=0;i<4;i++){
            System.out.println(vec[i].area());
        }
        System.out.println("Ordenados:"+estanEnOrden(vec));
        // TODO code application logic here
    }
    
}
