public class Aufgabe4 {
  public static void main(String[] args) {

    short s = 5;
    int i, j;
    byte b = 1;
    long x = 12;

    // boolean s = true; -> Bezeichner s existiert schon als short
    // i = j; -> j ist nicht initialisiert
    // i = s; -> s (short) ginge mit implizitem Widening, aber hier wäre es OK.
    //        -> In der Originalaufgabe ist s unten als boolean gemeint -> inkompatibel.
    // b = 1234; -> 1234 passt nicht in byte
    // s = x; -> long -> short ohne Cast nicht erlaubt (möglicher Werteverlust)
    // x = true; -> boolean kann nicht in long zugewiesen werden

    System.out.println("markierte Zeilen würden Compilerfehler erzeugen.");
  }
}
