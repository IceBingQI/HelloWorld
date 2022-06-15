package cn.wzvtc.chapter14.xt;

public class Hero2 {
    public static void main(String[] args) {
        Mortal ad = new ADHero();
        Mortal ap = new APHero();
        Hero2.kill(ad);
        Hero2.kill(ap);
    }
    public static void kill(Mortal hero){
        hero.die();
    }
}
