package org.example;

import jakarta.persistence.EntityManager;

import java.util.List;


public class CharacterRepository {

    public static void registerCharacter(Character character) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(character);
        em.getTransaction().commit();
    }

    public static List<Character> CharactersInEpisode(Episode episode) {
        EntityManager em = JPAUtil.getEntityManager();
        return em.createNativeQuery("SELECT CharID,Name,Birthday,Stand,IsAlly from Characters AS chars INNER JOIN (SELECT Teste.CharID as CharID2 from EpisChar as Teste where Teste.EpisodeID = :epnumber) as epischar ON chars.CharID = epischar.CharID2", Character.class)
                .setParameter("epnumber", episode.getEpisodeID())
                .getResultList();
    }

    public static List<String> CharactersNameInEpisode(Episode episode) {
        EntityManager em = JPAUtil.getEntityManager();
        return em.createNativeQuery("SELECT Name from Characters AS chars INNER JOIN (SELECT Teste.CharID as CharID2 from EpisChar as Teste where Teste.EpisodeID = :epnumber) as epischar ON chars.CharID = epischar.CharID2")
                .setParameter("epnumber", episode.getEpisodeID())
                .getResultList();
    }

}
