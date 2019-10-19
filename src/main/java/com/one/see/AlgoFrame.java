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


    private class AlgoCanvas extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            // 抗锯齿
            RenderingHints renderingHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.addRenderingHints(renderingHints);

            AlgoVisHelper.setStrokeWidth(g2d, 10);


            AlgoVisHelper.setColor(g2d, Color.CYAN);
            AlgoVisHelper.fillCircle(g2d, canvasWidth / 2, canvasHeight / 2, 200);

            g2d.setColor(Color.red);
            AlgoVisHelper.strokeCircle(g2d, canvasWidth / 2, canvasHeight / 2, 200);

        }


        @Override
        public Dimension getPreferredSize() {

            return new Dimension(canvasWidth, canvasHeight);
        }
    }
}
