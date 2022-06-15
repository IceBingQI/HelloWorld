package cn.wzvtc.moniti;

public class ClassB implements InterfaceA{
    @Override
    public int method(int n) {
        int result=1;
        for (int i=n;i>0;i--){
            result*=i;
        }
        return result;
    }
}
