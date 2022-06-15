package cn.wzvtc.chapter16;

public class Person {
    private String name;
    private int age;
    private String sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println(age);
    }

    public void addAge() {
        this.age += 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
