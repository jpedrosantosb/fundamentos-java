package datas;

import java.util.Date;

public class Date2 {

  public static void main(String[] args) {
    Long currentTimeMillis = System.currentTimeMillis();

    System.out.println(currentTimeMillis);
    // 1654267945285

    Date novaData = new Date(currentTimeMillis);

    System.out.println(novaData);

  }

}
