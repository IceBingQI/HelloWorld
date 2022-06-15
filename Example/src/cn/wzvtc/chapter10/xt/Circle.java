package cn.wzvtc.chapter10.xt;

public class Circle {
    //半径
    private int r;
    //给半径赋值
    public void setR(int r1){
        r=r1;
    }
    //取值
    public int getR(){
        return r;
    }
    //面积
    public double findArea(){
        return Math.PI*r*r;
    }
    //周长
    public double periMeter(){
        return Math.PI*2*r;
    }
}
