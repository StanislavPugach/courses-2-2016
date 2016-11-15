package homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stanislav Pugach on 14.11.2016.
 */
public class CheckListener implements ActionListener{
    private BankView bankView;
    private AccountDao accountDao;
    private long senderAccountNumber;
    private long recipientAccountNumber;

    public CheckListener(BankView view) {
        bankView = view;
        accountDao = new AccountDao();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        init();
        Account sender = accountDao.getAccountByAccountNumber(senderAccountNumber);
        Account recipient = accountDao.getAccountByAccountNumber(recipientAccountNumber);

        bankView.getSenderArea().setText(sender.getClient().toString() + "balance: " + sender.getBalance());
        bankView.getRecipientArea().setText(recipient.getClient().toString() + "balance: " + recipient.getBalance());
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
    }


}
