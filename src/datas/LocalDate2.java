package datas;

import java.time.LocalDate;

public class LocalDate2 {

  public static void main(String[] args) {
    LocalDate hoje = LocalDate.now();

    LocalDate ontem = hoje.minusDays(1);

    System.out.println(hoje);
    // 2022-06-03

    System.out.println(ontem);
    // 2022-06-02

  }

}
