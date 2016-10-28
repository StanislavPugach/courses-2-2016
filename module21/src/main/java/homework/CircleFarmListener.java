package homework;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by Stanislav Pugach on 28.10.2016.
 */
 class CircleFarmListener extends MouseAdapter{
    private volatile ArrayList<Circle> circles = new ArrayList();
    CircleFarmPanel farmPanel;

    public CircleFarmListener(CircleFarmPanel panel) {
        farmPanel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        Circle circle = new Circle();
        circles.add(circle.init(e.getPoint()));
        farmPanel.repaint();
        System.out.println("Click ");
    }


    public ArrayList<Circle> getCircles() {
        return circles;
    }
}
