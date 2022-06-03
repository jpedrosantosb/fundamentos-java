package string;

public class StringBuilder {

  public static void main(String[] args) {
    var nome = "João";

    final var builder = new java.lang.StringBuilder(nome);
    System.out.println(builder.append(" Bastos"));

    final var insert = builder.insert(0, "#").insert(builder.length(), "#");
    System.out.println(insert);

    final var reverse = builder.reverse();
    System.out.println(reverse);

  }

}
