package cn.wzvtc.moniti;

public class ClassA implements InterfaceA{
    @Override
    public int method(int n) {
        int result=0;
        for (int i=1;i<=n;i++){
            result+=i;
        }
        return result;
    }
}
