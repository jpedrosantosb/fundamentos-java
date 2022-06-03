package operadores;

public class Operadores {

  public static void main(String[] args) {
    
    // IGUALDADE
    final var numero = 11;
    System.out.println(numero == 10);
    System.out.println(numero != 10);
   
    final var letra = "B";
    System.out.println("A".equals(letra));
    System.out.println(!letra.equals("A"));
    
    // INCREMENTO
    var numeroUm = 1;
    System.out.println(++numeroUm);
    
    var variavel = 10;
    System.out.println(variavel--);
    System.out.println(variavel);
    
    // MATEMATICOS
    System.out.println(0 + 1);
    System.out.println(3 - 1);
    System.out.println(3 * 1);
    System.out.println(8 / 2);
    System.out.println(8 % 2); //módulo - resto da divisão
    
    var numeroDEZ = 10;
    numeroDEZ *= 2;
    System.out.println(numeroDEZ);
  }
  
  //< , > , >= , <=, &&, || OPERADORES LÓGICOS E RELACIONAIS
  
}
