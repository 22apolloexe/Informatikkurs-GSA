
/**
 * Beschreiben Sie hier die Klasse Summe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Summe
{
    static void ueberschrift() {
        System.out.println("\n BERECHNUNG DER SUMME \n");
    }
    static void sternchenreihe() {
        System.out.println("********************");
    }
    public static void main(String[] arg) {
        int a;
        int b;
        int sum;
        
        a = 4;
        b = -5;
        sum = a + b;
        // Ausgabe aller Methoden und der Summe
        ueberschrift();
        sternchenreihe();
        
        System.out.println(sum);
    }
}
