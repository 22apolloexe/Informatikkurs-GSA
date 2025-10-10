public class Aufgabe3 {
  public static void main(String[] args) {
    long maxLong = (long)Math.pow(2,63) - 1;   // 2^63 ist als double exakt, -1 ergibt Long-Maximum
    long minLong = - (long)Math.pow(2,63); 
    
    System.out.println("Min long = " + minLong); // Ergebnis: -9223372036854775808
    System.out.println("Max long = " + maxLong); // Ergebnis: 9223372036854775807
  }
}
