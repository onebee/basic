package com.one.see;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AlgoFrame extends JFrame {


    private int canvasWidth;
    private int canvasHeight;

    public AlgoFrame(String title, int canvasWidth, int canvasHeight) throws HeadlessException {
        super(title);
        this.canvasHeight = canvasHeight;
        this.canvasWidth = canvasWidth;

        AlgoCanvas canvas = new AlgoCanvas();
        // 设置画布的大小
//        canvas.setPreferredSize(new Dimension(canvasWidth,canvasHeight));
//        setSize(canvasWidth, canvasHeight);
        setContentPane(canvas);

        //
        pack();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public AlgoFrame(String title) throws HeadlessException {
        this(title, 1024, 768);
    }

    public int getCanvasWidth() {
        return canvasWidth;
    }

    public int getCanvasHeight() {
        return canvasHeight;
    }


    private class AlgoCanvas extends JPanel{

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D)g;

            Ellipse2D circle = new Ellipse2D.Double(50,50,300,300);

            int strokeWidth = 5;

            g2d.setStroke(new BasicStroke(strokeWidth));

            g2d.setColor(Color.red);
            g2d.draw(circle);


            g2d.setColor(Color.yellow);
            Ellipse2D circle2 = new Ellipse2D.Double(60,60,280,280);
            g2d.fill(circle2);
            // 个性化绘制代码
//            g2d.drawOval(50,50,300,300);
        }


        @Override
        public Dimension getPreferredSize() {

            return new Dimension(canvasWidth,canvasHeight);
        }
    }
}
