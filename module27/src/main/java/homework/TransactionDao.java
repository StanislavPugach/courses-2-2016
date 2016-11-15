package homework;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.math.BigDecimal;
import java.util.List;

import static homework.JPA_EntityManager.getEntityManager;

/**
 * Created by Stanislav Pugach on 07.11.2016.
 */
 class TransactionDao {
    private static final String  SET_NEW_BALANCE_BY_ID = "UPDATE Account SET balance=:newBalance" +
            " WHERE accountNumber=:accountNumber";
    private static final String GET_ALL_TRANSACTION_BY_ACCOUNT = "SELECT t FROM Transaction t" +
            " WHERE t.sender=:sender AND t.recipient=:recipient";
    private static EntityManager manager;

    public TransactionDao() {
        manager = getEntityManager();
    }

    public void addTransaction(Transaction transaction) {
        manager.getTransaction().begin();

        manager.persist(transaction);

        manager.getTransaction().commit();

    }

    public List getAllTransactionsByAccount(Account account) {
        manager.getTransaction().begin();

        List result = manager.createQuery(GET_ALL_TRANSACTION_BY_ACCOUNT)
                .setParameter("sender",account)
                .setParameter("recipient",account)
                .getResultList();
        manager.getTransaction().commit();
        return result;
    }

    public void makeTransaction(Transaction transaction) {
        manager.getTransaction().begin();

        Query senderQuery = manager.createQuery(SET_NEW_BALANCE_BY_ID);
        senderQuery.setParameter("newBalance",(transaction.getSender().getBalance()
                .subtract(transaction.getTransactionAmount())));
        senderQuery.setParameter("accountNumber",transaction.getSender().getAccountNumber());
        senderQuery.executeUpdate();

        Query recipientQuery = manager.createQuery(SET_NEW_BALANCE_BY_ID);
        recipientQuery.setParameter("newBalance",(transaction.getRecipient().getBalance()
                .add(transaction.getTransactionAmount())));
        recipientQuery.setParameter("accountNumber",transaction.getRecipient().getAccountNumber());
        recipientQuery.executeUpdate();

        manager.getTransaction().commit();
    }

}
