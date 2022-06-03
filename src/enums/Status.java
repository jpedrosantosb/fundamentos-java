package enums;

/**
 * @author joaop
 */
public enum Status {

  OPEN(01, "Aberto"), 
  CLOSE(02, "Fechado");

  private int cod;
  private String texto;

  Status(final int cod, final String texto) {

    this.cod = cod;
    this.texto = texto;
  }

  public int getCod() {
    return cod;
  }

  public String getTexto() {
    return texto;
  }

}
