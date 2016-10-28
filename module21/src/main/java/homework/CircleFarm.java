package homework;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Stanislav Pugach on 27.10.2016.
 */
public class CircleFarm extends JFrame {
    private JPanel panel = new CircleFarmPanel();

    public CircleFarm(String title){
        super(title);
        init();
    }

    private void init(){
        setSize(670,500);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        setLocation(xPos,yPos);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(panel);
    }

}
