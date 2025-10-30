
public class Spritkostenrechner
{
    static void ueberschrift() {
        System.out.println("****Benzinkostenrechner****");
    }
    static void sternchenreihe() {
        System.out.println("**************************");
    }
    public static void main(String[] arg) {
        
        ueberschrift();
        
        System.out.print("aktueller Spritpreis in Cent: ");
        double spritPreis;
        spritPreis = Kon.readDouble() / 100;
        
        System.out.print("Verbrauch des autos pro 100km in Liter: ");
        double verbrauchAuto;
        verbrauchAuto = Kon.readDouble();
        
        System.out.print("Zu fahrende Strecke in km: ");
        double Strecke;
        Strecke = Kon.readDouble();
        
        sternchenreihe();
        
        double kosten100km;
        double gesamtKosten;
        
        kosten100km = verbrauchAuto * spritPreis;
        gesamtKosten = (kosten100km * Strecke) / 100;
        
        System.out.print("Die Fahrt kostet " + gesamtKosten + " Euro.");
    }
}    