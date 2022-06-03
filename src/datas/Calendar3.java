package datas;

import java.util.Calendar;

public class Calendar3 {

  public static void main(String[] args) {

    Calendar agora = Calendar.getInstance();

    System.out.printf("%tc\n", agora);
    //sex. jun. 03 12:08:45 BRT 2022

    System.out.printf("%tF\n", agora);
    //2022-06-03

    System.out.printf("%tD\n", agora);
    //06/03/22

    System.out.printf("%tr\n", agora);
    //12:08:45 PM

    System.out.printf("%tT\n", agora);
    //12:08:45

  }

}
