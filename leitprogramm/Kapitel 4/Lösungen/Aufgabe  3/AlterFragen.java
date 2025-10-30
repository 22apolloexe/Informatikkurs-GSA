public class AlterFragen {
    public static void main(String [] args) {
        
        System.out.print("Hallo, wie heißt  du?");
        String benutzerName;
        benutzerName = Kon.readString();
        
        System.out.print("Welches Jahr haben wir, " + benutzerName + "? \nJahr: ");
        int aktuellesJahr;
        aktuellesJahr = Kon.readInt();
        
        System.out.print("In welchem Jahr bist du geboren? \nJahr: ");
        int geburtstagBenutzer;
        geburtstagBenutzer = Kon.readInt();
        
        System.out.print("Hattest du dieses Jahr schon Geburtstag \nFuer ja gebe 0 fuer nein 1 ein: ");
        int schonGeburtstag;
        schonGeburtstag = Kon.readInt();
        
        int alterBenutzer;
        
         if (schonGeburtstag ==  0){
            alterBenutzer = aktuellesJahr - geburtstagBenutzer;      
        }  else {
            alterBenutzer = aktuellesJahr - geburtstagBenutzer - 1;
        }
        System.out.print("Dann bist du " + alterBenutzer + " Jahre alt.");
    }
}
