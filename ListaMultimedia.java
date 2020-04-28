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
public class ListaMultimedia{
    private Multimedia [] multimedia;
    private int nObj;
    
    public int size(){
        return nObj;
    }
    
    public boolean add(Multimedia m){
        boolean sePuede;
        if(nObj<multimedia.length){
            sePuede = true;
            multimedia[nObj] = m;
            nObj++;
        }else{
            sePuede = false;
        }
        return sePuede;
    }
    
    public Multimedia get(int posicion){
        return multimedia[posicion];
    }
    
    public int indexOf(Multimedia m){
        int posicion = -1;
        for(int i=0;i<nObj;i++){
            if(multimedia[i].equals(m)){
                posicion = i;
            }
        }
        return posicion;
    }
    
    public String toString(){
        String str="";
        for(int i=0;i<nObj;i++){
            str = str+multimedia[i].toString();
        }
        return str;
    }
    
    public ListaMultimedia(int nMax){
        multimedia = new Multimedia[nMax];
        nObj = 0;
    }
}
