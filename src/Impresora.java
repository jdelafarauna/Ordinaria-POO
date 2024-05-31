import java.util.ArrayList;
import java.util.Collections;

public class Impresora {

    private ArrayList<Imprimible> lista;


    public Impresora(){
        lista = new ArrayList<>();
    }

    public void recibir(Imprimible imprimible){
        lista.add(imprimible);
        Collections.sort(lista);
    }

    public void imprimir(){
        for (Imprimible imp : lista){
            System.out.println(imp.toString());
        }
    }
}
