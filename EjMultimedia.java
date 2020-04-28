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
public class EjMultimedia {

    /**
     * @param args the command line arguments
     */
    
    //Método pedir Peliculas
    public static String [] pedirPeli(){
        Scanner tec = new Scanner(System.in);
        String tit,aut,form,dur,actor,actriz;
        boolean sePuede = false, hayActor, hayActriz, correcto;
        String [] datos = new String[6];
        System.out.println("--------------------------------------");
        System.out.println("Introduce el título:");
        tit = tec.nextLine();
        System.out.println("Introduce el autor:");
        aut = tec.nextLine();
        do{
            System.out.println("Introduce el formato:");
            form = tec.nextLine();
            correcto = comprFormato(form);
            if(correcto == false){
                System.out.println("Formato incorrecto");
            }
        }while(correcto == false);
        System.out.println("Introduce la duración:");
        dur = tec.nextLine();
        do{
            System.out.println("Introduce el actor");
            actor = tec.nextLine();
            if(actor.equals("")){
                hayActor = false;
            }else{
                hayActor = true;
            }
            System.out.println("Introduce la actriz:");
            actriz = tec.nextLine();
            if(actriz.equals("")){
                hayActriz = false;
            }else{
                hayActriz = true;
            }
            if(hayActor == false && hayActriz == false){
                System.out.println("Actor y actriz no pueden ser nulos los dos");
                sePuede = false;
            }else{
                sePuede = true;
            }
        }while(sePuede == false);
        datos[0]=tit;
        datos[1]=aut;
        datos[2]=form;
        datos[3]=dur;
        datos[4]=actor;
        datos[5]=actriz;
        return datos;
    }
    
    public enum form{wav,mp3,midi,avi,mov,mpg,cdAudio,dvd}
    
    //Comprobar formato de la película
    public static boolean comprFormato(String formato){
        boolean correcto;
        form wav = form.wav;
        form mp3 = form.mp3;
        form midi = form.midi;
        form avi = form.avi;
        form mov = form.mov;
        form mpg = form.mpg;
        form cdAudio = form.cdAudio;
        form dvd = form.dvd;
        if(wav.name().equals(formato)||mp3.name().equals(formato)||midi.name().equals(formato)||avi.name().equals(formato)||mov.name().equals(formato)||mpg.name().equals(formato)||cdAudio.name().equals(formato)||dvd.name().equals(formato)){
            correcto = true;
        }else{
            correcto = false;
        }
        return correcto;
    }
    
    public static void mostrarLista(ListaMultimedia lista){
        for(int i=0; i < lista.size(); i++){
            System.out.println("----------------------");
            System.out.println(lista.get(i));
        }
    }
    
    //Programa principal
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int tam = 10;
        boolean sePuede;
        ListaMultimedia lista = new ListaMultimedia(tam);
        //PEDIR LAS 3 PELICULAS
        System.out.println("*********************************************");
        String [] peli;
        Pelicula pelicula;
        int i = 0;
        do{
            peli = pedirPeli();
            pelicula = new Pelicula(peli[0],peli[1],peli[2],Integer.parseInt(peli[3]),peli[4],peli[5]);
            sePuede = lista.add(pelicula);
            if(sePuede == false){
                System.out.println("No se ha podido añadir a la lista");
            }else{
                i++;
            }
        }while(i<3);
        mostrarLista(lista);
        //PEDIR TITULO Y AUTOR PARA CREAR OTRA PELI
        System.out.println("*********************************************");
        System.out.println("Introduce el título de la película:");
        String tit = tec.nextLine();
        System.out.println("Introduce el autor de la película:");
        String aut = tec.nextLine();
        pelicula = new Pelicula(tit,aut,"avi",0,"actor","actriz");
        sePuede = lista.add(pelicula);
        int posicion;
        if(sePuede == false){
            System.out.println("No se ha podido añadir a la lista");
        }else{
            posicion = lista.indexOf(pelicula);
            if(posicion == -1){
                System.out.println("No se ha encontrado el elemento");
            }else{
                System.out.println("La posición de la pelicula en la lista es: "+posicion);
                System.out.println(lista.get(posicion));
            }
        }
        ListaMultimedia lista2 = new ListaMultimedia(10);
        //CREAR DISCOS
        Disco disco1 = new Disco ("Spider-Man","Sam Raimi","avi",120,"accion");
        Disco disco2 = new Disco ("Trench","Twenty One Pilots","mp3",130,"pop");
        Disco disco3 = new Disco ("Interestelar","Christopher Nolan","avi",150,"SyFi");
        sePuede = lista2.add(disco1);
        if(sePuede == false){
            System.out.println("No se ha podido añadir a la lista");
        }
        sePuede = lista2.add(disco2);
        if(sePuede == false){
            System.out.println("No se ha podido añadir a la lista");
        }
        sePuede = lista2.add(disco3);
        if(sePuede == false){
            System.out.println("No se ha podido añadir a la lista");
        }
        mostrarLista(lista2);
        Disco disco4 = new Disco(disco1.getTitulo(),disco1.getAutor());
        sePuede = lista2.add(disco4);
        if(sePuede == false){
            System.out.println("No se ha podido añadir a la lista");
        }else{
            posicion = lista2.indexOf(disco4);
            if(posicion == -1){
                System.out.println("No se ha encontrado el elemento");
            }else{
                System.out.println("La posición de la pelicula en la lista es: "+posicion);
                System.out.println(lista.get(posicion));
            }
        }
        
        // TODO code application logic here
    }
    
}
