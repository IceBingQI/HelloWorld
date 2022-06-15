package cn.wzvtc.chapter14.xt;

public class Demo {
    public static void main(String[] args) {
        Master master = new Master();
        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet bird = new Bird();
        master.feed(dog);
    }
}
