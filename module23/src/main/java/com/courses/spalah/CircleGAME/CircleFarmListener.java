package com.courses.spalah.CircleGAME;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

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
        for (Iterator<Circle> iterator = farmPanel.getCircles().iterator();iterator.hasNext();) {
            Circle circle = iterator.next();
            int circleRadius = circle.getRadius();
            int circleX = circle.getPosition().x;
            int circleY = circle.getPosition().y;
            int mouseX = e.getX() - circleRadius / 2;
            int mouseY = e.getY() - circleRadius / 2;
            if (Math.sqrt((circleX - mouseX)*(circleX - mouseX)+(circleY - mouseY)*(circleY - mouseY)) <= circleRadius){
                iterator.remove();
            }
        }
    }

}
