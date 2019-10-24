package com.one.see;

import java.awt.*;

public class Circle {

    public int x, y;

    private int r;


    public int vx, vy;

    public boolean isFilled = false;

    public Circle(int x, int y, int r, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.vx = vx;
        this.vy = vy;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void move(int minx, int miny, int maxx, int maxy) {
        x += vx;
        y += vy;
        checkCollision(minx, miny, maxx,maxy);
    }

    /**
     * 碰撞检测
     *
     * @param minx
     * @param miny
     * @param maxx
     * @param maxy
     */
    private void checkCollision(int minx, int miny, int maxx, int maxy) {

        if (x - r < minx) {
            x = r;
            vx = -vx;
        }
        if (x + r >= maxx) {
            x = maxx - r;
            vx = -vx;
        }

        if (y - r < miny) {
            y = r;
            vy = -vy;
        }
        if (y + r >= maxy) {
            y = maxy - r;
            vy = -vy;
        }


    }

    // 判断传入的坐标是否在该圆内
    public boolean contain(Point point) {
       // 判断点到圆心的距离是否小于R
        return (x-point.x)*(x-point.x) + (y-point.y)*(y-point.y) <= r*r;
    }
}
