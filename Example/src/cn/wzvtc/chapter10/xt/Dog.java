package cn.wzvtc.chapter10.xt;

public class Dog {
    private String name;
    private String color;
    private int age;
    public void setName(String name1){
        name=name1;
    }
    public void setColor(String color1){
        color=color1;
    }
    public void setAge(int age1){
        age=age1;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
    public void sayHello(){
        System.out.println("名字："+name+"，年龄："+age+"岁，颜色："+color);
    }
    public void run(){
        System.out.println("我在奔跑");
    }
}
