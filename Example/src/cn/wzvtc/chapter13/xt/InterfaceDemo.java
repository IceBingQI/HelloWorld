package cn.wzvtc.chapter13.xt;

public class InterfaceDemo {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        System.out.println(classA.method(5));
        System.out.println(classB.method(5));
    }
}
interface interfaceA{
    public abstract int method(int n);
}
class ClassA implements interfaceA{
    public int method(int n){
        return (1+n)*n/2;
    }
}
class ClassB implements interfaceA{
    public int method(int n){
        int x=1;
        for (int i = 2 ; i <= n ; i++){
            x*=i;
        }
        return x;
    }
}