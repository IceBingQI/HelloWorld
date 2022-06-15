package cn.wzvtc.chapter10.xt;

public class Person_output {
    public static void main(String[] args) {
        Person s = new Person();
        s.setName("张三");
        s.setAge(20);
        s.setSex("男");
        s.addAge();
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSex());
    }
}
