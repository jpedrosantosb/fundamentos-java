package datas;

import java.text.DateFormat;
import java.util.Date;

public class DateFormat1 {

  public static void main(String[] args) {
    Date agora = new Date();

    String dateToStr = DateFormat.getInstance().format(agora);
    System.out.println(dateToStr);
    // 03/06/2022 12:10

    dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
    System.out.println(dateToStr);
    // 3 de junho de 2022 12:10


    dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(agora);
    System.out.println(dateToStr);
    // 3 de junho de 2022 12:10:46 BRT

  }

}
