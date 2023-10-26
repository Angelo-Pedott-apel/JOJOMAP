package org.example;

import jakarta.persistence.EntityManager;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.Persistence.createEntityManagerFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        var factory = createEntityManagerFactory("JOJOMAP");

        EntityManager em = factory.createEntityManager();

        List<EpisodeSQL> matchingEpisodes =
                em.createQuery("SELECT b from EpisodeSQL b where 1=1", EpisodeSQL.class)
                        .getResultList();

        List<Episode> episodeList = new ArrayList<>();

        for (EpisodeSQL matchingEpisode : matchingEpisodes) {
            int epid = matchingEpisode.getEpisodeID();
            double lat = matchingEpisode.getLatitude().toBigInteger().doubleValue();
            double longi = matchingEpisode.getLongitude().toBigInteger().doubleValue();
            Episode newep = new Episode(String.valueOf(epid), lat, longi);
            episodeList.add(newep);
        }

        ClosestEpisode closestEpisode = EpisodeService.findClosestFromCoord(0,0, episodeList);

        System.out.println(closestEpisode.episode.getName()+ "------" + closestEpisode.distance);

        List<EpisodeSQL> closestEpisodeSQL =
                em.createQuery("SELECT b from EpisodeSQL b where episodeID = ?1", EpisodeSQL.class)
                        .setParameter(1, closestEpisode.episode.getName())
                        .getResultList();

        System.out.println(closestEpisodeSQL.get(0).getLocation());
        System.out.println("batata");


    }
    }
