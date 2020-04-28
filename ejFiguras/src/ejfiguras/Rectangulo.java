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
public class Rectangulo extends Figuras{
    private double altura;
    private double base;
    //Calcular área
    public double area(){
        double area=0;
        area = base * altura;
        return area;
    }
    //Calcular perímetro
    public double per(){
        double perimetro=0;
        perimetro = (base + altura) * 2;
        return perimetro;
    }
    
    public String toString(){
        String cad;
        cad = super.toString();
        return cad;
    }
    
    public Rectangulo(double posx,double posy,double altura, double base){
        super(posx,posy);
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(Color color,double posx,double posy,double altura, double base){
        super(color,posx,posy);
        this.base = base;
        this.altura = altura;
    }
}
