package loiane.javaintermediario.aula63;

public class ExemploPrintf {
  public static void main(String[] args) {

    //Formatar string
    System.out.printf("%s", "Olá, Mundo!");
    System.out.println();
    System.out.printf("%S", "olá mundo!");
    System.out.println();

    //Formatar caractere
    System.out.printf("%c", 'c');
    System.out.println();
    System.out.printf("%C", 'c');
    System.out.printf("%n"); //Pular linha

    //Números inteiros
    int valor = 123456789;
    int valor2 = -123456789;
    System.out.printf("%d", valor);
    System.out.println();

    //Número ponto flutuante
    double pontoFlutuante = 3.123456789;
    System.out.printf("%f", pontoFlutuante);
    System.out.println();

    //Espaços
    String olaMundo = "Olá, Mundo!";
    System.out.printf("%20s", olaMundo);
    System.out.println();
    System.out.printf("%-20s", olaMundo);
    System.out.println();
    System.out.printf("%+d", valor);
    System.out.println();
    System.out.printf("%+d", valor2);
    System.out.println();
    System.out.printf("%015d", valor);
    System.out.println();
    System.out.printf("%,d", valor);
    System.out.println();
    System.out.printf("% d", valor);
    System.out.println();
    System.out.printf("% d", valor2);
    System.out.println();
    System.out.printf("%.2f", pontoFlutuante);
    System.out.println();
    System.out.printf("R$%10.2f", pontoFlutuante);
    System.out.println();

    testeMaisCompleto();

  }

  /// A classe Java.util.Formater faz a mesma coisa com o printf, porém, ela já é formatada
  private static void testeMaisCompleto(){

    double[] precos = {1000, 123.54, 7843.567, 1, 4.56789};

    for (int i=0; i<precos.length; i++){
      System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
    }
  }
}
