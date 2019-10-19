package com.one.see;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AlgoVisHelper {

    private AlgoVisHelper() {

    }

    public static void setStrokeWidth(Graphics2D g2d, int w) {

        int strokeWidth = w;
        g2d.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));


    }

    /**
     * 创建空心的圆
     *
     * @param graphics2D
     * @param x
     * @param y
     * @param radius
     */
    public static void strokeCircle(Graphics2D graphics2D, int x, int y, int radius) {

        Ellipse2D circle = new Ellipse2D.Double(x - radius, y - radius, 2 * radius, 2 * radius);
        graphics2D.draw(circle);
    }


    /**
     * 创建实心的圆
     *
     * @param graphics2D
     * @param x
     * @param y
     * @param radius
     */
    public static void fillCircle(Graphics2D graphics2D, int x, int y, int radius) {

        Ellipse2D circle = new Ellipse2D.Double(x - radius, y - radius, 2 * radius, 2 * radius);
        graphics2D.fill(circle);
    }

    public static void setColor(Graphics2D graphics2D, Color color) {
        graphics2D.setColor(color);

    }

    public static void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
