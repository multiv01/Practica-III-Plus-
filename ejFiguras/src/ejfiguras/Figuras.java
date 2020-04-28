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
abstract public class Figuras{
    private Color color;
    private Punto posicion;
    public void setColor(Color color) {
        this.color = color;
    }

    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    public Color getColor() {
        return color;
    }

    public Punto getPosicion() {
        return posicion;
    }
    
    public Figuras(Color color,double posx, double posy){
        this.color = color;
        this.posicion = new Punto(posx,posy);
    }
    
    abstract public double area();
    
    abstract public double per();
    
    public boolean menorQue(Figuras f){
        boolean menor = false;
        if(this.area() < f.area()){
            menor = true;
        }
        return menor;
    }
    
    @Override
    public String toString(){
        String cad;
        cad = "Centro de la figura: "+posicion+"\nColor: "+color;
        return cad;
    }
    
    public Figuras(double posx, double posy){
        color = Color.BLACK;
        posicion = new Punto(posx,posy);
    }
}
