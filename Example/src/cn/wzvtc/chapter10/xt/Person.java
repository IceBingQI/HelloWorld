package cn.wzvtc.chapter10.xt;

public class Person {
    //姓名
    private String name;
    //年龄
    private int age;
    //性别
    private String sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println(age);
    }
    public void addAge(){
        age += 2;
    }
    public void setName(String name1){
        name=name1;
    }
    public void setAge(int age1){
        age=age1;
    }
    public void setSex(String sex1){
        sex=sex1;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
}
