package com.one.see;

import javax.swing.*;
import java.awt.*;

public class test {

    public static void main(String[] args) {

        // JAVA 事件分发线程
        EventQueue.invokeLater(() -> {

//            JFrame jFrame = new JFrame("Welcome");
//            jFrame.setSize(500, 500);
//            jFrame.setResizable(false);
//            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            jFrame.setVisible(true);
            AlgoFrame frame = new AlgoFrame("one", 500, 500);
        });


    }
}
