/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejfiguras;

/**
 *
 * @author Adrián Torralba Gómez
 */
public class Punto{
    private double posx;
    private double posy;

    public void setPosx(double posx) {
        this.posx = posx;
    }
    
    public void setPosy(double posy) {
        this.posy = posy;
    }

    public double getPosx() {
        return posx;
    }
    
    public double getPosy() {
        return posy;
    }
    
    public Punto(double posx, double posy){
        this.posx = posx;
        this.posy = posy;
    }
    
}
