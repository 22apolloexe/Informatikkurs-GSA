public class NamenFragen {

    public static void main(String[] args) {
        
        System.out.print("Wie heisst du? "); 
        String benutzerName;
        benutzerName = Kon.readString();
        System.out.println("Hallo, " + benutzerName + "!");
    }
}