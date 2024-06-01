import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Imprimible implements Comparable<Imprimible>, Serializable {
    private String nombre;
    private int numPags;
    private boolean color;
    private int prioridad;
    private LocalDate fechaC;
    private static final int MIN_P = 1;
    private static final int MAX_P = 10;
    private static final int MIN_Pags = 1;
    public Imprimible(String nombre, int numPags,Boolean color, int prioridad){
        this.nombre = nombre;
        this.numPags = numPags;
        this.color = color;
        this.prioridad = prioridad;
        this.fechaC = generarFechaAleatoria();//LocalDate.now();
    }
    public int getPrioridad(){
        return this.prioridad;
    }
    public static LocalDate generarFechaAleatoria() {
        long minDay = LocalDate.of(1970, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2050, 12, 31).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    public LocalDate getFecha(){
        return this.fechaC;
    }
    @Override
    public int compareTo(Imprimible o) {
        return Integer.compare(o.getPrioridad(),this.prioridad);
    }

    @Override
    public String toString() {
        return "Imprimible{" +
                "nombre='" + nombre + '\'' +
                ", numPags=" + numPags +
                ", color=" + color +
                ", prioridad=" + prioridad +
                ", fechaC=" + fechaC +
                '}';
    }
}
