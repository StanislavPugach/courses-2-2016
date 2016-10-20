package homework;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Stanislav Pugach on 13.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator("Credit calculator");
            }
        });
    }
}
