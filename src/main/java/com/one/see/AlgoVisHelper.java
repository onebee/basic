package com.one.see;

import java.awt.*;

public class AlgoVisHelper {

    private AlgoVisHelper() {

    }

    public static void setStrokeWidth(Graphics2D g2d,int w){

        int strokeWidth = w;
        g2d.setStroke(new BasicStroke(strokeWidth,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));

    }
}
