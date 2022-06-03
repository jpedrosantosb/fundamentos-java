package datas;

import java.time.LocalDateTime;

public class LocalDate5 {

  public static void main(String[] args) {
    LocalDateTime agora = LocalDateTime.now();

    System.out.println(agora);
    // 2022-06-03T12:19:06.607019900

    LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

    System.out.println(futuro);
    // 2022-06-05T13:19:18.607019900

  }

}
