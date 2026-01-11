package loiane.javaintermediario.aula58;

/// AUTOBOXING E AUTO UN-BOXING, transforma um tipo primitivo em tipo objeto e vice-versa
public class TesteAutoboxing {
  public static void main(String[] args) {

    //Autoboxing
    Short num7 = 1;
    Byte num8 = 10;
    Integer num9 = 100;
    Integer num19 = 200;
    Long num10 = 10000l;
    Float num11 = 3.5f;
    Double num12 = 3.5555;
    Boolean flag2 = true;
    Character b = 'b';

    //Auto unboxing
    int num13 = num9; //A mesma coisa de fazer = "num9.intValue()";

    //autoboxing em expressões
    num9++;
    System.out.println(num9);

    //auto unboxing num9 -> autoboxing num13/num9 -> num14
    Integer um14 = num13/num9;




  }
}
