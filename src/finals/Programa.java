package finals;

public class Programa {

  public static void main(String[] args) {
    final Gamer gamer = new Gamer();

    final CasualGamer casualGamer = new CasualGamer();

    final var game = "Counter-Strike";
    
    //game = "LoL"; (erro, devido ao atributo game ser final[n�o modific�vel])

    System.out.println(gamer.pc());
    System.out.println(gamer.teclado());
    System.out.println("-----------//-------");
    System.out.println(casualGamer.play(game));
    System.out.println(casualGamer.pc());
  }
}
