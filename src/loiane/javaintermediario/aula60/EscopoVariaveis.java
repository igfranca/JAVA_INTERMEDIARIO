package loiane.javaintermediario.aula60;

public class EscopoVariaveis {

  private int valor;

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public int calculaValor(int valor){
    valor = valor + 10;
    return valor;
  }

  public int teste() {
    int valor = 5;
    if (true) {
      valor--;
    }
    this.valor = valor; //Referencia valor global/atributo da classe
    return valor;
  }

  public static void main(String[] args) {

    EscopoVariaveis escopo = new EscopoVariaveis();

    escopo.setValor(10);

    System.out.println(escopo.getValor());

    System.out.println(escopo.calculaValor(20));

    System.out.println(escopo.getValor());

    System.out.println(escopo.teste());


  }
}


