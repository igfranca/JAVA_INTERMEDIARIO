package loiane.javaintermediario.aula65;

/** Recurso que permite embutir informações complementares no código-fonte
 * São precedidas de arroba (@), @Overrride, @Inherited, @Deprecated, @SupressWarnings */

@InformacaoAula(
    autor = "Igor",
    aulaNumero = 65,
    blog = "google.com"
)
public class TesteAnotacoes {
  @InformacaoAula(
      autor = "Igor",
      aulaNumero = 65,
      blog = "google.com"
  )
  public static void main(String[] args) {



  }
}
