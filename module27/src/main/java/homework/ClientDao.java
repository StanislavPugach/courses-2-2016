package homework;


import javax.persistence.*;
import java.util.List;

import static homework.JPA_EntityManager.*;

/**
 * Created by Stanislav Pugach on 07.11.2016.
 */
 class ClientDao {
    private static EntityManager manager;

    public ClientDao() {
        manager = getEntityManager();
    }

    public void addClient(Client client) {
        manager.getTransaction().begin();

        manager.persist(client);

        manager.getTransaction().commit();
    }

    public Client findById(long id) {
        manager.getTransaction().begin();

        Client foundClient = manager.find(Client.class, id);

        manager.getTransaction().commit();

        return foundClient;
    }

    public Client findByTaxpayerIN(int taxpayerIN) {
        manager.getTransaction().begin();

        Client foundClient = manager.find(Client.class, taxpayerIN);

        manager.getTransaction().commit();
        manager.close();

        return foundClient;
    }

    public List findWithFirstName(String firstName) {
        manager.getTransaction().begin();

        List list = manager.createQuery("SELECT c FROM Client c WHERE c.firstName LIKE :firstName")
                .setParameter("firstName",firstName)
                .getResultList();

        manager.getTransaction().commit();
        manager.close();
        return list;
    }

}
