package cn.wzvtc.chapter16;

public class Person_output {
    public static void main(String[] args) {
        Person s = new Person();
        s.setName("张三");
        s.setAge(20);
        s.setSex("男");
        s.addAge();
        s.showAge();
        s.study();
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSex());
    }
}
