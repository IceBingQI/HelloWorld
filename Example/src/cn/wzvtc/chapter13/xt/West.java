package cn.wzvtc.chapter13.xt;

public class West {
    public static void main(String[] args) {
        X1 x = new X1();
        x.eat();
        x.c();
    }
}
class T{
    public void eat(){
        System.out.println("吃斋");
    }
    public void speak(){
        System.out.println("念佛");
    }
    public void take(){
        System.out.println("取经");
    }
}
class X1 extends T{
    public void c(){
        System.out.println("除妖");
    }
}
class X2 extends T {
    public void q(){
        System.out.println("牵马");
    }
}
class X3 extends T {
    public void t(){
        System.out.println("挑行李");
    }
}