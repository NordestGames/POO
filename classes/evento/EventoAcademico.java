package classes.evento;

public class EventoAcademico {
    String nomeDoEevento;
    String localDoEvento;
    int numeroDeParticipantes;

    EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEevento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    void mostraEvento(){
        System.out.println("nomeDoEvento: " + this.nomeDoEevento);
        System.out.println("localDoEvento: " + this.localDoEvento);
        System.out.println("numeroDeParticipantes: " + this.numeroDeParticipantes);
    }
}
