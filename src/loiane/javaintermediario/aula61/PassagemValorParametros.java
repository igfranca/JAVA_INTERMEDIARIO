package loiane.javaintermediario.aula61;

public class PassagemValorParametros {
  public static void main(String[] args) {

    Contato contato = new Contato("Contato 1", "1234-5678", "contat1@email.com");
    int valor = 10;

    System.out.println(contato);
    System.out.println(valor);

    testePassagemValorReferencia(valor, contato);

    System.out.println(contato);
    System.out.println(valor);




  }

  private static void testePassagemValorReferencia(int valor, Contato contato) {

    int novoValor = valor + 10;
    valor = novoValor;

    contato = new Contato("Contato 2", "2345-3214", "contato2@email.com");


  }
}
