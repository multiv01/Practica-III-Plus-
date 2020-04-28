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
public class Circulo extends Figuras{
    private double radio;
    
    public double area(){
        double area=0;
        area = Math.PI * radio * radio;
        return area;
    }
    
    public double per(){
        double perimetro=0;
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    
    public String toString(){
        String cad;
        cad = super.toString();
        return cad;
    }
    
    public Circulo(Color color,double radio, double posx, double posy){
        super(color,posx,posy);
        this.radio = radio;
    }
    
    public Circulo(double posx, double posy, double radio){
        super(posx,posy);
        this.radio = radio;
    }
}