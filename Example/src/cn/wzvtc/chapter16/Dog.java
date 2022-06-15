package cn.wzvtc.chapter16;

public class Dog {
    private String color;
    private String bread;

    public void eat(){
        System.out.println("");
    }

    public void lookHome(){
        System.out.println("");
    }

    public Dog(String color, String bread) {
        this.color = color;
        this.bread = bread;
    }

    public Dog() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
}
