package com.one.see;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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

    public static void main(String[] args) {

        int screenWidth = 800;
        int screenHeight = 800;
        int N = 25;

        AlgoVisualizer visualizer = new AlgoVisualizer(screenWidth,screenHeight,N);

        // JAVA 事件分发线程



    }

}
