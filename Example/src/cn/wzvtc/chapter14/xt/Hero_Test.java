package cn.wzvtc.chapter14.xt;

public class Hero_Test {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Mortal ad = new ADHero();
        Mortal ap = new APHero();
        hero.kill(ad);
        hero.kill(ap);
    }
}
