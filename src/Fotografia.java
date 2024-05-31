public class Fotografia extends Imprimible {

    private int largo;
    private int ancho;

    public Fotografia(int largo, int ancho, String nombre,int numPags, boolean color, int prioridad){
        super(nombre,numPags,color,prioridad);
        this.largo = largo;
        this.ancho = ancho;
    }

    public void imprimir(){

    }
}
