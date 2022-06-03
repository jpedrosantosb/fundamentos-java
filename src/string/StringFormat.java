package string;

public class StringFormat {

  public static void main(String[] args) {
    var nome = "João";
    var segundoNome = "Pedro";
    final var nomeCompleto = nome + segundoNome;

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);
    final var mensagem = String.format("O cliente %s possui sobre nome %s ", nome, segundoNome);
    System.out.println(mensagem);

    System.out.println(String.format("Numero %.2f ", 1.2375d));
  }

}
