package org.example;

import jakarta.persistence.EntityManager;

import java.util.List;

public class EpisodeRepository {

    public static List<Episode> findMatchingEpisodes(List<Integer> partlist) {
        EntityManager em = JPAUtil.getEntityManager();
        return em.createQuery("SELECT episode from Episode episode where part in :parts", Episode.class)
                .setParameter("parts", partlist)
                .getResultList();
    }
}
