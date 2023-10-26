package org.example;

import jakarta.persistence.EntityManager;

import java.util.List;

import static jakarta.persistence.Persistence.createEntityManagerFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        var factory = createEntityManagerFactory("JOJOMAP");

        EntityManager em = factory.createEntityManager();

        List<Episode> matchingEpisodes =
                em.createQuery("SELECT b from Episode b where 1=1", Episode.class)
                        .getResultList();

        ClosestEpisode closestEpisode = EpisodeService.findClosestFromCoord(0,0, matchingEpisodes);

        System.out.println(closestEpisode.episode.getEpisodeID()+" - " +closestEpisode.episode.getLocation().trim()+ " - " + closestEpisode.distance);
    }
    }
