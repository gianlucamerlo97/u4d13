package gianlucamerlo;

import gianlucamerlo.DAO.EventiDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("U4-W3-D2");

    public static void main(String[] args) {
         EntityManager em= emf.createEntityManager();

        EventiDAO ed= new EventiDAO(em);
        LocalDate date1= LocalDate.of(2025,07,01);
        /*Evento num1= new Evento("Raccolta di beneficenza", date1,"Raccolta fondi per ricerca sul cancro", TipoEvento.BENEFICENZA,200);
        ed.save(num1);*/
        /*Evento num2= new Evento("Partita Champions", date1.plusDays(15),"Finale Champions", TipoEvento.SPORTIVO,60000);
        ed.save(num2);*/
        /*Evento num3= new Evento("Cena Aziendale", date1.minusDays(30),"Cena Aziendale con i boss", TipoEvento.LAVORO,25);
        ed.save(num3);*/
    }
}
