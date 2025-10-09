package classes.pessoa;

public class Pessoa {
    private String nome;
    private float altura;

    public Pessoa (String nome, float altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome(){
        return "Nome: " + nome;
    }

    public void setNome(String nome){
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", altura= " + altura;
    }
}
