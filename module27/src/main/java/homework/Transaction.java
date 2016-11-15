package homework;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Stanislav Pugach on 06.11.2016.
 */
@Entity
@Table(name = "transaction")
class Transaction {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "transaction_number")
    private long transactionNumber;
    @JoinColumn(name = "sender_account")
    @ManyToOne(cascade = CascadeType.ALL)
    private Account sender;
    @JoinColumn(name = "recipient_account")
    @ManyToOne(cascade = CascadeType.ALL)
    private Account recipient;
    @Column(name = "amount")
    private BigDecimal transactionAmount;
    private static long transactionNumberCounter;

    public Transaction() {
    }

    public Transaction(Account sender, Account recipient, BigDecimal transactionAmount) {
        transactionNumberCounter++;
        this.sender = sender;
        this.recipient = recipient;
        this.transactionAmount = transactionAmount;
        transactionNumber = transactionNumberCounter;
    }

    public long getId() {
        return id;
    }

    public long getTransactionNumber() {
        return transactionNumber;
    }

    public Account getSender() {
        return sender;
    }

    public Account getRecipient() {
        return recipient;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }
}
