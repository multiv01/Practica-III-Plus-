/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejfiguras2;

/**
 *
 * @author Adrián Torralba Gómez
 */
public class ListaFiguras {
    Figuras[] lista;
    int num = 0;
    
    ListaFiguras(int n) {
        lista = new Figuras[n];
    }
    
    public int size() {
        return num;
    }
    
    public boolean add(Figuras m) {
        if (num < lista.length) {
            lista[num] = m;
            num++;
            return true;
        } else {
            return false;
        }
    }
    public Figuras get(int indice) {
        if (indice < num) {
            return lista[indice];
        } else {
            return null;
        }
    }
}
