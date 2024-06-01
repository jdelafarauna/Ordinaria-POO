import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Impresora {

    private ArrayList<Imprimible> lista;


    public Impresora(){
        lista = new ArrayList<>();
    }

    public void recibir(Imprimible imprimible){
        lista.add(imprimible);
        Collections.sort(lista);
    }

    public void setLista(ArrayList<Imprimible> lista){
        this.lista = lista;
    }

    public void imprimir(){
        for (Imprimible imp : lista){
            System.out.println(imp.toString());
        }
    }

    public void hacerBackUp(String fichero){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))){
            for(Imprimible imprimible : lista){
                oos.writeObject(imprimible);
            }
            oos.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }

    public void leerBCK(String fichero){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))){
            Imprimible imprimible;
            while((imprimible = (Imprimible) ois.readObject()) != null){
                System.out.println(imprimible);
            }
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void imprimirSinPrioridad(){
        Impresora listaSinPrioridad = new Impresora();
        listaSinPrioridad.setLista(this.lista);
        Collections.sort(listaSinPrioridad.lista, Comparator.comparing(Imprimible::getFecha));
        listaSinPrioridad.imprimir();
    }
}
