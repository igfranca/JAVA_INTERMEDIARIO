package loiane;

import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma frase: ");
    String a = sc.nextLine();

    System.out.printf("Você digitou: %s\n", a);
    System.out.printf("Novamente, sua palavra é: %s\n", a);
    System.out.printf("Outra vez, sua palavra é: %s", a);
  }
}
