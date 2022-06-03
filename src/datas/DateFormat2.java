package datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat2 {

  public static void main(String[] args) {
    Date agora = new Date();

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    String dataFormatada = formatter.format(agora);

    System.out.println(dataFormatada);
    // 03/06/2022

  }

}
