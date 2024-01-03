package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import static jakarta.persistence.Persistence.createEntityManagerFactory;

public class JPAUtil {

    private static final EntityManagerFactory FACTORY = createEntityManagerFactory("JOJOMAP");

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}
