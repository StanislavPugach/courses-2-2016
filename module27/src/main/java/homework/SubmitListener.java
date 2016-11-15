package homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

/**
 * Created by Stanislav Pugach on 15.11.2016.
 */
public class SubmitListener implements ActionListener {
    private BankView bankView;
    private AccountDao accountDao;
    private long senderAccountNumber;
    private long recipientAccountNumber;
    private BigDecimal amount;
    private TransactionDao transactionDao;

    public SubmitListener(BankView view) {
        bankView = view;
        accountDao = new AccountDao();
        transactionDao = new TransactionDao();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        init();
        Account sender = accountDao.getAccountByAccountNumber(senderAccountNumber);
        Account recipient = accountDao.getAccountByAccountNumber(recipientAccountNumber);

        Transaction transaction = new Transaction(sender,recipient,amount);
        transactionDao.makeTransaction(transaction);
        transactionDao.addTransaction(transaction);
    }

    private void init() {
        try {
            senderAccountNumber = Long.parseLong(bankView.getSenderField().getText());
        } catch (NumberFormatException e) {
            bankView.getSenderArea().setText("Fill Account Number!");
        }
        try {
            recipientAccountNumber = Long.parseLong(bankView.getRecipientField().getText());
        } catch (NumberFormatException e) {
            bankView.getRecipientArea().setText("Fill Account Number!");
        }

        try {
            amount = new BigDecimal(bankView.getAmountField().getText());
        } catch (NumberFormatException e) {
            bankView.getInfoArea().setText("Fill Amount Number!");
        }
    }
}
