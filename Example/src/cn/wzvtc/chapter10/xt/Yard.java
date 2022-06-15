package cn.wzvtc.chapter10.xt;

public class Yard {
    private int length;
    private int width;

    public void setLength(int length1) {
        length = length1;
    }

    public void setWidth(int width1) {
        width = width1;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    public int getAcreage() {
        return length * width;
    }
}
