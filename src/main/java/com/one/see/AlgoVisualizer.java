package com.one.see;

import java.awt.*;

/***
 * 相当于Control 层
 */
public class AlgoVisualizer {


    private Circle[] circles;
    private AlgoFrame frame;

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
            for (Circle circle : circles) {
                circle.move(0, 0, frame.getCanvasWidth(), frame.getCanvasHeight());
            }

        }

    }


}
