package com.one.see;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        int screenWidth = 800;
        int screenHeight = 800;

        int N = 1_0;
        int R = 50;
        Circle[] circles = new Circle[N];
        for (int i = 0; i < N; i++) {


            int x = (int) (Math.random() * (screenWidth - 2 * R)) + R;
            int y = (int) (Math.random() * (screenHeight - 2 * R)) + R;
            int vx = (int) (Math.random() * 11) - 5;
            int vy = (int) (Math.random() * 11) - 5;
            circles[i] = new Circle(x, y, R, vx, vy);

        }


        // JAVA 事件分发线程
        EventQueue.invokeLater(() -> {

            AlgoFrame frame = new AlgoFrame("one", screenWidth, screenHeight);

            new Thread(() -> {

                while (true) {
                    // 绘制数据
                    frame.render(circles);
                    AlgoVisHelper.pause(50);

                    //更新数据
                    for (Circle circle : circles) {
                        circle.move(0,0,screenWidth,screenHeight);
                    }

                }


            }).start();

        });


    }
}
