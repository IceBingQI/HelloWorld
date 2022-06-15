package cn.wzvtc.chapter10;

public class Example03 {
    public static void main(String[] args) {
        //实例化学生
        Student s = new Student();
        //对年龄赋值
        s.age = 20;
        //对姓名赋值
        s.name = "张三";
        //调用方法
        s.introduce();

        Student s2 = new Student();
        s2.age = 21;
        s2.name = "李四";
        s2.introduce();
    }
}
