package homework;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Stanislav Pugach on 06.11.2016.
 */
@Entity
@Table(name = "account")
class Account {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JoinColumn(name = "client")
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;
    @Column(name = "account_number")
    private long accountNumber;
    @Column(name = "balance")
    private BigDecimal balance;
    private static long accountNumberCount = 0;

    public Account(){
    }

    public Account(Client client, BigDecimal balance) {
        accountNumberCount++;
        this.client = client;
        this.balance = balance;
        accountNumber = accountNumberCount;
    }

    public long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
