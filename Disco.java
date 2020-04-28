/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejmultimedia;

/**
 *
 * @author Adrián Torralba Gómez
 */
public class Disco extends Multimedia{
    private String genero;
    
    public String getString(){
        return genero;
    }
    
    public String toString(){
        String info = super.toString()+"\nGénero: "+genero;
        return info;
    }
    
    public Disco(String titulo, String autor, String formato, int duracion, String genero){
        super (titulo, autor, formato, duracion);
        this.genero = genero;
    }
    public Disco(String titulo, String autor){
        super(titulo,autor,"---",0);
        genero = "---";
    }
}
