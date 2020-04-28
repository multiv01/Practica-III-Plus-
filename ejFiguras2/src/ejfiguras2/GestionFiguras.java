/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejfiguras2;
import java.awt.Color;
/**
 *
 * @author Adrián Torralba Gómez
 */
public class GestionFiguras {
    private ListaFiguras lista;
    private boolean sePuede;
    public GestionFiguras() {
        lista = new ListaFiguras(10);
    }
    
    public void insertarFigura(Figuras f){
        lista.add(f);
    }
    
    public void listar(){
        for(int i=0;i<lista.size();i++){
            System.out.println(".....................................");
            System.out.println(lista.get(i));
        }
    }
    
    public boolean estanEnOrden(){
        boolean ordenadas = true;
        double areaAnt = 0, areaAct = 0;
        for(int i=0; i < lista.size(); i++){
            areaAct = lista.get(i).area();
            if(areaAnt < areaAct){
                areaAnt = areaAct;
            }else{
                ordenadas = false;
            }
        }
        return ordenadas;
    }
}
