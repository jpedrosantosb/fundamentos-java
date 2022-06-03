package datas;

import java.util.Calendar;

public class Calendar2 {

  public static void main(String[] args) {
    Calendar agora = Calendar.getInstance();

    System.out.println("A data corrente é : " + agora.getTime());
    // A data corrente é : Fri Jun 03 12:06:40 BRT 2022

    agora.add(Calendar.DATE, -15);
    System.out.println("15 dias atrás: " + agora.getTime());
    // 15 dias atrás: Thu May 19 12:06:40 BRT 2022

    agora.add(Calendar.MONTH, 4);
    System.out.println("4 meses depois: " + agora.getTime());
    // 4 meses depois: Mon Sep 19 12:06:40 BRT 2022

    agora.add(Calendar.YEAR, 2);
    System.out.println("2 anos depois: " + agora.getTime());
    // 2 anos depois: Thu Sep 19 12:06:40 BRT 2024

  }

}
