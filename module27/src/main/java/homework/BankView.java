package homework;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Stanislav Pugach on 14.11.2016.
 */
public class BankView extends JFrame {
    private JPanel panel = new JPanel();
    private JLabel sender = new JLabel("Sender");
    private JLabel recipient = new JLabel("Recipient");
    private JLabel amount = new JLabel("Amount");
    private JLabel firstName = new JLabel("FirstName");
    private JLabel lastName = new JLabel("LastName");
    private JLabel taxPayerIN = new JLabel("TaxPayerIN");
    private JLabel accountNumber = new JLabel("AccountNumber");

    private JTextField senderField = new JTextField();
    private JTextField recipientField = new JTextField();
    private JTextField amountField = new JTextField();
    private JTextField firstNameField = new JTextField();
    private JTextField lastNameField = new JTextField();
    private JTextField taxpayerINField = new JTextField();
    private JTextField accountNumberField = new JTextField();

    private JTextArea senderArea = new JTextArea();
    private JTextArea recipientArea = new JTextArea();
    private JTextArea infoArea = new JTextArea();

    private JButton check = new JButton("Check");
    private JButton submit = new JButton("Submit");
    private JButton getTransactionsByAccountNum = new JButton("Get Transactions");
    private JButton getTransactionsByClient = new JButton("Get Transactions");
    private JButton getAccouts = new JButton("Get Accounts");
    private JButton getAllClients = new JButton("Get All Clients");
    private JButton getClient = new JButton("Get Client");


    public BankView(String title) {
        super(title);
        init();
    }

    private void init(){
        setSize(570,500);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        setLocation(xPos,yPos);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(panel);

        panel.setLayout(null);
        panel.add(sender);
        panel.add(recipient);
        panel.add(amount);
        panel.add(firstName);
        panel.add(lastName);
        panel.add(taxPayerIN);
        panel.add(accountNumber);

        panel.add(senderField);
        panel.add(recipientField);
        panel.add(amountField);
        panel.add(firstNameField);
        panel.add(lastNameField);
        panel.add(taxpayerINField);
        panel.add(accountNumberField);

        panel.add(senderArea);
        senderArea.setLineWrap(true);
        senderArea.setWrapStyleWord(true);
        panel.add(recipientArea);
        recipientArea.setLineWrap(true);
        recipientArea.setWrapStyleWord(true);
        panel.add(infoArea);
        infoArea.setLineWrap(true);
        infoArea.setWrapStyleWord(true);

        panel.add(check);
        panel.add(submit);
        panel.add(getTransactionsByAccountNum);
        panel.add(getTransactionsByClient);
        panel.add(getAccouts);
        panel.add(getAllClients);
        panel.add(getClient);

        sender.setBounds(40,10,150,20);
        amount.setBounds(250,10,150,20);
        recipient.setBounds(470,10,100,20);

        senderField.setBounds(10,40,100,20);
        recipientField.setBounds(450,40,100,20);
        amountField.setBounds(220,40,100,20);

        senderArea.setBounds(10,70,180,150);
        recipientArea.setBounds(370,70,180,150);

        check.setBounds(225,100,100,20);
        submit.setBounds(225,150,100,20);

        firstName.setBounds(10,250,100,20);
        firstNameField.setBounds(110,250,100,20);
        lastName.setBounds(10,280,100,20);
        lastNameField.setBounds(110,280,100,20);
        taxPayerIN.setBounds(10,310,100,20);
        taxpayerINField.setBounds(110,310,100,20);
        getTransactionsByClient.setBounds(10,340,150,20);
        getAccouts.setBounds(10,370,150,20);
        getAllClients.setBounds(10,400,150,20);
        getClient.setBounds(10,430,150,20);

        accountNumber.setBounds(250,250,100,20);
        accountNumberField.setBounds(350,250,100,20);
        getTransactionsByAccountNum.setBounds(250,280,150,20);
        infoArea.setBounds(250,310,300,150);

        check.addActionListener(new CheckListener(this));
        submit.addActionListener(new SubmitListener(this));
    }

    public JTextField getSenderField() {
        return senderField;
    }

    public JTextField getRecipientField() {
        return recipientField;
    }

    public JTextField getAmountField() {
        return amountField;
    }

    public JTextField getFirstNameField() {
        return firstNameField;
    }

    public JTextField getLastNameField() {
        return lastNameField;
    }

    public JTextField getTaxpayerINField() {
        return taxpayerINField;
    }

    public JTextField getAccountNumberField() {
        return accountNumberField;
    }

    public JTextArea getSenderArea() {
        return senderArea;
    }

    public JTextArea getRecipientArea() {
        return recipientArea;
    }

    public JTextArea getInfoArea() {
        return infoArea;
    }
}
