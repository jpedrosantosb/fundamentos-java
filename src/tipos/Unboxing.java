package tipos;

public class Unboxing {

  public static void main(String[] args) {
    
    //int i = new Integer(3);
    Integer I = 3;

    int inteiro = Integer.valueOf(2022);

    //boolean b = new Boolean(true);
    boolean b2 = Boolean.TRUE;
    boolean b3 = Boolean.getBoolean("false");
    
    System.out.println(inteiro);
    System.out.println(I);
    //System.out.println(i);
    System.out.println(b2);
    System.out.println(b3);
  }
  
}
