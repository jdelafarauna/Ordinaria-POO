public class Principal {
    private static final String BCK = "sinImprimir.dat";
    public static void main(String[] args) {
        Impresora imp = new Impresora();
        imp.recibir(new DocTxt("Uno", true, "doc1", 3, true, 1));
        imp.recibir(new DocTxt("Dos", true, "doc2", 1, true, 10));
        imp.recibir(new DocTxt("Tres", true, "doc3", 1, true, 5));
        imp.recibir(new Fotografia(12,12,"foto",1,false, 3));
        System.out.println("Imprimir con prioridad");
        imp.imprimir();
        System.out.println("Hacer backUp");
        imp.hacerBackUp(BCK);
        System.out.println("Imprimir sin prioridad");
        imp.imprimirSinPrioridad();
    }
}