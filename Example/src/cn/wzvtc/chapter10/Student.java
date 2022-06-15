package cn.wzvtc.chapter10;
/**
 * 学生累
 */
public class Student {
    //年龄
    int age;
    //姓名
    String name;

    //自我介绍
    public void introduce(){
        System.out.println("我叫"+ name + "，今年" + age + "岁");
    }
}
