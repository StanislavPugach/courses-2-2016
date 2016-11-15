package homework;

import javax.swing.*;

/**
 * Created by Stanislav Pugach on 14.11.2016.
 */
public class Bank {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BankView("BankApp");
            }
        });
    }
}
