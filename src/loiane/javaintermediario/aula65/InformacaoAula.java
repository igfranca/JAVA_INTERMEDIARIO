package loiane.javaintermediario.aula65;

//Forma de criar uma anotação
@interface InformacaoAula {

  String autor();

  int aulaNumero();

  String blog() default "https://www.google.com.br";

  String site() default "https://www.google.com.br";
}
