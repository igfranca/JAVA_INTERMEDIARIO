package loiane.javaintermediario.aula56;

public enum TipoDocumento {

  CPF {
    @Override
    public String geraNumeroTeste() {
      return CPF.geraNumeroTeste();
    }
  }, CNPJ {
    @Override
    public String geraNumeroTeste() {
      return CNPJ.geraNumeroTeste();
    }
  };

  public abstract String geraNumeroTeste();

}
