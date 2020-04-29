
package herencia1;

/**
 *
 * @author Agustin Taiel Peanelli
 */
public class Multimedia {

    private String titulo;
    private String autor;
    private String formato;
    private double duracion;
    
    public String getTit() {
        return titulo;
    }
    public void setTit(String aux) {
        titulo = aux;
    }
    public String getAut(){
        return autor;
    }
    public void setAut(String aux) {
        autor = aux;
    }
    public String getForm(){
        return formato;
    }
    public void setForm(String aux) {
        formato = aux;
    }
    public double getDur(){
        return duracion;
    }
    public void setDur(double aux) {
        duracion = aux;
    }
 
    public String toString(){
        String info = "Titulo: "+titulo+"\nAutor: "+autor+"\nFormato: "+formato+"\nDuración: "+duracion;
        return info;
    }  
    public boolean equals(Multimedia obj1, Multimedia obj2){
        if (obj1.getTit().equals(obj2.getTit()) && obj1.getAut().equals(obj2.getAut())) {
            return true;
        } else {
            return false;
        }
    }
}

