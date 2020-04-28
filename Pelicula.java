
package herencia1;

/**
 *
 * @author Agustin Taiel Peanelli
 */
public class Pelicula extends Multimedia{

    private String actorPrin;
    private String actrizPrin;
    private static String tipo = "Pelicula";
    
    public String getTip() {
        return tipo;
    }
    public String getActor(){
        return actorPrin;
    }
    public String getActriz(){
        return actrizPrin;
    }
    
    public Pelicula(String tit, String aut) {
        super.setTit(tit);
        super.setAut(aut);
    }
    
    public Pelicula(String act, int gen){
        if (gen == 0) {
            this.actorPrin = act;
        } else if (gen ==1) {
            this.actrizPrin = act;
        }
        
    }
    
    @Override public String toString(){
        String inf = super.toString()+"\nActor: "+actorPrin+"\nActriz: "+actrizPrin;
        return inf;   
    } 
}
