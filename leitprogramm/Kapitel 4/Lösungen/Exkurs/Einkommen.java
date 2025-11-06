public class Einkommen {

    static final double GRUNDEINKOMMEN = 100000.00;
    static final double PAUSCHALE = 40000.00;
    static final double EUROPROREDE = 400.0;
    static final double EUROPROSTUNDESEKR = 200.0;

    static int r, s; 
    static double e;  

    
    public static void eingabe() {
        System.out.println("Reden? ");
        r = Kon.readInt();
        System.out.println("Sekretariatsstunden? ");
        s = Kon.readInt();
    }

    
    public static void berechnung() {
        e = GRUNDEINKOMMEN + PAUSCHALE + s * EUROPROSTUNDESEKR + r * EUROPROREDE;
    }

    
    public static void ausgabe() {
        System.out.println("Das Gesamteinkommen beträgt: " + e);
    }

    
    public static void main(String[] args) {
        eingabe();
        berechnung();
        ausgabe();
    }
}