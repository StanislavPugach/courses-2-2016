package com.courses.spalah.CircleGAME;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by Stanislav Pugach on 28.10.2016.
 */
 class CircleFarmListener extends MouseAdapter{
    private CircleFarmPanel farmPanel;

    public CircleFarmListener(CircleFarmPanel panel){
        farmPanel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (Circle circle : farmPanel.getCircles()) {
            if (Math.sqrt((circle.getVx()-e.getX())*(circle.getVx()-e.getX())+(circle.getVy()-e.getY())*(circle.getVy()-e.getY()))<=circle.getRadius()){
                farmPanel.getCircles().remove(circle);
            }
        }
        System.out.println("Click ");
    }

}
