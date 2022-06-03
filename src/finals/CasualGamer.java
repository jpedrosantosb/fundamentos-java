package finals;

public class CasualGamer
  extends Gamer {

  @Override
  public String pc() {
    return "PC da classe CasualGamer...";
  }

  public String play(final String game) {
    return "Jogando " + game;
  }

}
