package classes.pessoa;

/*
        Prática:
    Crie uma classe para representar uma pessoa, com os atributos privados de nome e altura. 
    Além do construtor, crie os métodos de acesso, set’s e get’s e também um método para retornar uma representação textual (toString) dos dados de uma pessoa.

 */
public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Goku", 1.80F);
        //Pessoa pessoa = new Pessoa();
        System.out.println(pessoa.toString());
        System.out.println(pessoa);
    }
}
