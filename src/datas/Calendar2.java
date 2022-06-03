package datas;

import java.util.Calendar;

public class Calendar2 {

  public static void main(String[] args) {
    Calendar agora = Calendar.getInstance();

    System.out.println("A data corrente � : " + agora.getTime());
    // A data corrente � : Fri Jun 03 12:06:40 BRT 2022

    agora.add(Calendar.DATE, -15);
    System.out.println("15 dias atr�s: " + agora.getTime());
    // 15 dias atr�s: Thu May 19 12:06:40 BRT 2022

    agora.add(Calendar.MONTH, 4);
    System.out.println("4 meses depois: " + agora.getTime());
    // 4 meses depois: Mon Sep 19 12:06:40 BRT 2022

    agora.add(Calendar.YEAR, 2);
    System.out.println("2 anos depois: " + agora.getTime());
    // 2 anos depois: Thu Sep 19 12:06:40 BRT 2024

  }

}
