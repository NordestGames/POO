package classes.registro;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    double percentualDeCobranca;

    void inicializaRegistroAcademico(String n, String m, int cod, double perc){
        nome = n;
        matricula = m;
        codigoCurso = cod;
        percentualDeCobranca = perc;
    }

    double calculaMensalidade(){
        return 100 * codigoCurso * percentualDeCobranca;
    }

}