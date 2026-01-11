package loiane.javaintermediario;

import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma frase: ");
    String a = sc.nextLine();

    System.out.printf("Você digitou: %s", a);

  }
}
