package homework;

import javax.persistence.EntityManager;


import java.math.BigDecimal;
import java.util.List;

import static homework.JPA_EntityManager.getEntityManager;

/**
 * Created by Stanislav Pugach on 07.11.2016.
 */
 class AccountDao {

    private static EntityManager manager;

    public AccountDao() {
        manager = getEntityManager();
    }

    public void addAccount(Account account){
        manager.getTransaction().begin();

        manager.persist(account);

        manager.getTransaction().commit();
    }

    public Account getAccountByAccountNumber(long accountNumber) {
        manager.getTransaction().begin();

        Account result = (Account) manager.createQuery("SELECT a FROM Account a WHERE a.accountNumber=:accountNumber")
                .setParameter("accountNumber",accountNumber)
                .getSingleResult();

        manager.getTransaction().commit();
        return result;
    }

    public List getAllAccountsOfClient(Client client) {
        manager.getTransaction().begin();

        List result = manager.createQuery("SELECT a FROM Account a WHERE a.client=:client")
                .setParameter("client",client)
                .getResultList();
        manager.getTransaction().commit();
        return result;
    }

}
