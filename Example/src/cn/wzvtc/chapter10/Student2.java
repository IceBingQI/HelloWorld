package cn.wzvtc.chapter10;
/**
 * 学生累
 */
public class Student2 {
    //年龄
    private int age;
    public void getAge(int studentAge){
        age=studentAge;
    }
    //姓名
    private String name;
    public void getName(String studentName){
        name=studentName;
    }
    //自我介绍
    public void introduce(){
        System.out.println("我叫"+ name + "，今年" + age + "岁");
    }
}
