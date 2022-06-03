package abstracts;

public class Quadrado
  extends FormaGeometrica {

  private String nome;
  private Double area;

  public Quadrado(final String nome, final Double area) {
    this.nome = nome;
    this.area = area;
  }

  @Override
  public String nome() {
    return nome;
  }

  @Override
  public Double area() {
    return area;
  }

  @Override
  public String toString() {
    return "[nome=" + nome + ", area=" + area + "]";
  }

}
