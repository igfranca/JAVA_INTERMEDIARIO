package loiane.javaintermediario.aula57;

/// CLASSES WRAPPERS
public class TesteWrapper {

  public static void main(String[] args) {

    //Tipos primitivos no java
    short num1 = 1;
    byte num2 = 10;
    int num3 = 100;
    long num4 = 1000l;
    float num5 = 3.5f;
    double num6 = 3.5555;
    boolean flag = true;
    char a = 'a';


    //Classes que representam os tipos primitivos
    Short num7 = new Short((short) 1);
    Byte num8 = new Byte((byte)10);
    Integer num9 = new Integer(100);
    Integer num19 = new Integer(200);
    Long num10 = new Long(10000l);
    Float num11 = new Float(3.5f);
    Double num12 = new Double(3.5555);
    Boolean flag2 = new Boolean(true);
    Character b = new Character('b');

    Integer num13 = new Integer("10000");

    Double num14 = new Double("3.5");

    System.out.println(num13.intValue());
    System.out.println(num13.longValue());

    Long num15 = num13.longValue();

    int num16 = Integer.parseInt("10000");
    double num17 = Double.parseDouble("3.555");
    System.out.println(num16 + " " + num17);

    Integer num18 = Integer.valueOf(1343);
    System.out.println(num18);

    System.out.println(num9 == num19); //num9 e num13 são tipos de uma classe, portante não pode compara com ==
    System.out.println(num9.equals(num19));

  }
}
