package cn.wzvtc.chapter15.xt.wuliu;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        //快递任务
        SendTask sendTask = new SendTask("SF123456789",80);
        //调用送货前的方法
        sendTask.sendBefore();
        System.out.println("===========================================");
        //创建交通工具
        ZTransportation t = new ZTransportation("浙C·88888","AE86","张三");
        //创建GPS对象
        Phone phone = new Phone();
        //将交通工具与GPS传入送货方法
        sendTask.send(t,phone);
        System.out.println("===========================================");
        //调用送货后的方法
        sendTask.sendAfter(t);
        //保养
        t.upkeep();

    }
}
