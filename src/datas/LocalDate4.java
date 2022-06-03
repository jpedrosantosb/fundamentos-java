package datas;

import java.time.LocalTime;

public class LocalDate4 {

  public static void main(String[] args) {
    LocalTime agora = LocalTime.now();

    System.out.println(agora);
    // 12:18:09.012463500

    LocalTime maisUmaHora = agora.plusHours(1);

    System.out.println(maisUmaHora);
    // 13:18:09.012463500

  }

}
