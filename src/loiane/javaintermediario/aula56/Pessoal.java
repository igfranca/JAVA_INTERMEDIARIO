package loiane.javaintermediario.aula56;

public class Pessoal {

  private TipoDocumento tipoDocumento;
  private String numeroDocumento;

  public Pessoal() {
  }

  public Pessoal(TipoDocumento tipoDocumento, String numeroDocumento) {
    this.tipoDocumento = tipoDocumento;
    this.numeroDocumento = numeroDocumento;
  }

  public TipoDocumento getTipoDocumento() {
    return tipoDocumento;
  }

  public void setTipoDocumento(TipoDocumento tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  @Override
  public String toString() {
    return "Pessoal{" +
        "tipoDocumento=" + tipoDocumento +
        ", numeroDocumento='" + numeroDocumento + '\'' +
        '}';
  }
}
