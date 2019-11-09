package com.one.see;

import java.awt.*;
import java.awt.event.*;

/***
 * 相当于Control 层
 */
public class AlgoVisualizer {



    private Circle[] circles;
    private AlgoFrame frame;

    private boolean isAnimated = true;

    public AlgoVisualizer(int screenWidth, int screenHeight, int N) {

        int R = 50;
        circles = new Circle[N];
        for (int i = 0; i < N; i++) {
            int x = (int) (Math.random() * (screenWidth - 2 * R)) + R;
            int y = (int) (Math.random() * (screenHeight - 2 * R)) + R;
            int vx = (int) (Math.random() * 11) - 5;
            int vy = (int) (Math.random() * 11) - 5;
            circles[i] = new Circle(x, y, R, vx, vy);

        }

        EventQueue.invokeLater(() -> {

            frame = new AlgoFrame("one", screenWidth, screenHeight);
            frame.addKeyListener(new AlgoKeyListener());
            frame.addMouseListener(new MouseListener());
            new Thread(this::run).start();

        });


    }

    // 动画逻辑
    private void run() {

        while (true) {
            // 绘制数据
            frame.render(circles);
            AlgoVisHelper.pause(50);

            //更新数据
            if (isAnimated) {
                for (Circle circle : circles) {
                    circle.move(0, 0, frame.getCanvasWidth(), frame.getCanvasHeight());
                }
            }


        }

    }


    private class AlgoKeyListener extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            super.keyReleased(e);
            if (e.getKeyChar()== ' ') {
                isAnimated = !isAnimated;
            }

        }
    }

    private class MouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent event) {
            super.mousePressed(event);
            event.translatePoint(0,-(frame.getBounds().height-frame.getCanvasHeight()));
//            System.out.println(event.getPoint());

            for (Circle circle : circles) {
                if (circle.contain(event.getPoint())) {

                    circle.isFilled = !circle.isFilled;
                }
            }

        }
    }

    public static void main(String[] args) {

        int screenWidth = 800;
        int screenHeight = 800;
        int N = 25;

        AlgoVisualizer visualizer = new AlgoVisualizer(screenWidth,screenHeight,N);

        // JAVA 事件分发线程



    }

}
