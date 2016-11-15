package homework;

import javax.persistence.*;

/**
 * Created by Stanislav Pugach on 06.11.2016.
 */
@Entity
@Table(name = "client")
class Client {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "taxpayer_number")
    private long taxpayerIN;

    public Client() {
    }

    public Client(String firstName, String lastName, long taxpayerIN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.taxpayerIN = taxpayerIN;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getTaxpayerIN() {
        return taxpayerIN;
    }

    @Override
    public String toString() {
        return
                " firstName = " + firstName + '\n' +
                " lastName = " + lastName + '\n' +
                " taxpayerIN = " + taxpayerIN + '\n';
    }
}
