public class Aufgabe2 {
  public static void main(String[] args) {
    int i = (int)(Math.pow(2,31)) - 5;

    for (int k = 0; k <= 10; k++) {
      int val = i + k;
      System.out.println("i+" + k + " = " + val);
    }
    // Beobachtung: Nach 2147483647 folgt -2147483648 (Überlauf im 32-Bit-int).
  }
}
