import java.io.Serializable;

public class DocTxt extends Imprimible implements Serializable {

    private String texto;
    private boolean dobleCara;

    public DocTxt(String texto, boolean dobleCara, String nombre, int numPags,Boolean color, int prioridad ){
        super(nombre,numPags,color,prioridad);
        this.texto = texto;
        this.dobleCara = dobleCara;
    }



}
