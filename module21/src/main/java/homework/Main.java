package homework;

import javax.swing.*;

/**
 * Created by Stanislav Pugach on 27.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CircleFarm("Circle Farm");
            }
        });
    }
}
