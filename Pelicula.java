/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejmultimedia;
import java.util.Scanner;
/**
 *
 * @author Adrián Torralba Gómez
 */
public class Pelicula extends Multimedia {
    private String actorPrinc;
    private String actrizPrinc;
    
    public void setActor(String actorPrinc){
        this.actorPrinc = actorPrinc;
    }
    
    public void setActriz(String actrizPrinc){
        this.actrizPrinc = actrizPrinc;
    }
    
    public String getActor(){
        return actorPrinc;
    }
    
    public String getActriz(){
        return actrizPrinc;
    }
    
    public String toString(){
        String info = super.toString()+"\nActor Principal: "+actorPrinc+"\nActriz Principal: "+actrizPrinc;
        return info;
    }
    
    public Pelicula(String titulo, String autor, String formato, int duracion, String actorPrinc, String actrizPrinc){
        super (titulo,autor,formato,duracion);
        this.actorPrinc = actorPrinc;
        this.actrizPrinc = actrizPrinc;
    }
}
