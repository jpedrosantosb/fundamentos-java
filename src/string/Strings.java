package string;

public class Strings {

  public static void main(String[] args) {

    var nome = "Jo?o";
    var sobreNome = " Bastos";
    final var nomeCompleto = nome + sobreNome;

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);
    var string = new String(" Minha String ");

    System.out.println("Char na posi??o : " + string.charAt(5));
    System.out.println("Quantidade=" + string.length());
    System.out.println("Sem Trim [" + string + "]");
    System.out.println("Com Trim [" + string.trim() + "]");
    System.out.println("Lower " + string.toLowerCase());
    System.out.println("Upper " + string.toUpperCase());
    System.out.println("Cont?m M? " + string.contains("M"));
    System.out.println("Cont?m X? " + string.contains("X"));
    System.out.println("Replace " + string.replace("n", "N"));
    System.out.println("Equals? " + string.equals(" Minha String "));
    System.out.println("EqualsIgnoreCase? "
        + string.equalsIgnoreCase(" minha sTrinG "));
    System.out.println("Substring(1,6)=" + string.substring(1, 6));

  }

}
