package classes.registro;

public class DemoRegistroAcademico {
    public static void main(String[] args){
        double mensalidade;
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael", "1234567", 3, 0.5);
        mensalidade = michael.calculaMensalidade();
        System.out.println("Mensalidade 2: " + mensalidade);

        RegistroAcademico roberto = new RegistroAcademico();
        System.out.println("Mensalidade Roberto " + roberto.calculaMensalidade());
    }
}
