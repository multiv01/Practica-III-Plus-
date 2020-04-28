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
public class Multimedia {
    private String titulo;
    private String autor;
    private String formato;
    private int duracion;
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setFormato(String formato){
        this.formato = formato;
    }
    
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getFormato(){
        return formato;
    }
    
    public double getDuracion(){
        return duracion;
    }
    @Override
    public String toString(){
        String info = "Título: "+titulo+"\nAutor: "+autor+"\nFormato: "+formato+"\nDuración: "+duracion;
        return info;
    }
    
    public boolean equals(){
        boolean iguales = false;
        if(titulo.equals(autor)){
            iguales = true;
        }
        return iguales;
    }
    
    public Multimedia(String titulo, String autor, String formato, int duracion){
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }
    
    public Multimedia(){
        titulo = "";
        autor = "";
        formato = "";
        duracion = 0;
    }
}
