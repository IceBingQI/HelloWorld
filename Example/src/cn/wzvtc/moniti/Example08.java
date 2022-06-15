package cn.wzvtc.moniti;

public class Example08 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        makeRun(dog);
        makeRun(cat);
    }
    public static void makeRun(Animal a){
        a.run();
    }
}
