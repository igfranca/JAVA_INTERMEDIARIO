package loiane.javaintermediario.aula68;

public class Teste {
  public static void main(String[] args) {


    MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
    MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 900);
    MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 200);
    MinhaThreadRunnable thread4 = new MinhaThreadRunnable("#4", 2200);
    MinhaThreadRunnable thread5 = new MinhaThreadRunnable("#5", 1400);

  }
}
