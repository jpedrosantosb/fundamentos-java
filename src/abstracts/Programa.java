package abstracts;


public class Programa {

  public static void main(String[] args) {
    
    final FormaGeometrica quadrado = new Quadrado("Quadrado", 77.0);

    System.out.println(quadrado);
    
    System.out.println(quadrado.desenha(40,50));
    System.out.println(quadrado.nome());
    System.out.println(quadrado.area());
  }

}
