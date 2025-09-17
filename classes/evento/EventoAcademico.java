package classes.evento;

public class EventoAcademico {
    private String nomeDoEevento;
    private String localDoEvento;
    private int numeroDeParticipantes;

    EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEevento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public void mostraEvento(){
        System.out.println("nomeDoEvento: " + this.nomeDoEevento);
        System.out.println("localDoEvento: " + this.localDoEvento);
        System.out.println("numeroDeParticipantes: " + this.numeroDeParticipantes);
    }
}
