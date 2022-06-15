package cn.wzvtc.chapter16;

public class Cat {
    private String color;
    private String bread;

    public void eat(){
        System.out.println("");
    }

    public void catchMouse(){
        System.out.println("");
    }

    public Cat(String color, String bread) {
        this.color = color;
        this.bread = bread;
    }

    public Cat() {
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
