package com.courses.spalah.homework;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by Stanislav Pugach on 28.10.2016.
 */
 class CircleFarmListener extends MouseAdapter{
    private volatile ArrayList<Circle> circles = new ArrayList();
    private CircleFarmPanel farmPanel;

    public CircleFarmListener(CircleFarmPanel panel){
        farmPanel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        Circle circle = new Circle();
        circles.add(circle.init(e.getPoint()));
        Thread movingCircle = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    farmPanel.moveCircle(circle);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
        movingCircle.start();
        System.out.println("Click ");
    }


    public ArrayList<Circle> getCircles() {
        return circles;
    }
}
