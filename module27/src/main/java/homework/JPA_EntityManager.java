package homework;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Stanislav Pugach on 09.11.2016.
 */
 class JPA_EntityManager {
    private static final String PERSISTENCE_UNIT = "homework.bank.mysql";
    private static EntityManager manager;

    static {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        manager = entityManagerFactory.createEntityManager();

    }

    public static EntityManager getEntityManager() {
        return manager;
    }

}

