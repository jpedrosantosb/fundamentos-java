package statics;

public class Programa {
  public static void main(String[] args) {
    final Cachorro pitbull = new Cachorro();
    pitbull.porte = "Grande";

    final Cachorro pinscher = new Cachorro();
    pinscher.porte = "Mini";

    System.out.println(pitbull.porte);
    System.out.println(pinscher.porte);

    Cachorro.late();
  }

}
