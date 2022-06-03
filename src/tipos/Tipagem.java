package tipos;

public class Tipagem {

  public static void main(String[] args) {
    String texto = "meu texto";
    //texto = 1000; ERRO
    System.out.println(texto);
    
    //Integer numero = "123456789"; ERRO
    Integer numero = Integer.valueOf("2022");
    System.out.println(numero);
    
    var num = Integer.valueOf("123456");

    var txt = "O Numero é : " ;

    System.out.println(txt + num);
    
  }

}
