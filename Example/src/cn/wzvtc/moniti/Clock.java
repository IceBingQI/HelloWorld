package cn.wzvtc.moniti;

public class Clock {
    int h,m,s;
    public void show(){
        System.out.println(h+":"+m+":"+s);
    }

    public Clock(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
}
