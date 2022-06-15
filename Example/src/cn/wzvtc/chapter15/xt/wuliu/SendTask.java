package cn.wzvtc.chapter15.xt.wuliu;

/**
 * 快递任务类
 */
public class SendTask {
    /**
     *快递单号
     */
    private String number;
    /**
     *重量
     */
    private double goodWeight;

    public SendTask(String number, double goodWeight) {
        this.number = number;
        this.goodWeight = goodWeight;
    }

    public SendTask(){

    }
    /**
     *送货检查
     */
    public void sendBefore(){
        System.out.println("订单开始处理，仓库验货……");
        System.out.println("货物重量："+this.goodWeight+"KG");
        System.out.println("货物检验完毕");
        System.out.println("货物装填完毕");
        System.out.println("运货人已通知");
        System.out.println("快递单号："+this.number);
    }

    /**
     * 送货
     * @param t
     * @param tool
     */
    public void send(ZTransportation t,GPS tool){
        System.out.println("运货人："+t.getAdmin()+",正在驾驶编号为："+t.getNumber()+" 的"+t.getModel()+"运送货物");
        t.transport();
        String location = tool.showCoordinate();
        System.out.println("货物当前的坐标为："+location);
    }

    /**
     * 运送后的操作
     * @param t
     */
    public void sendAfter(Transportation t){
        System.out.println("货物运送已完成");
        System.out.println("运货人:"+t.getAdmin()+"所驾驶的编号为"+t.getNumber()+" 的"+t.getModel()+"已归还");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getGoodWeight() {
        return goodWeight;
    }

    public void setGoodWeight(double goodWeight) {
        this.goodWeight = goodWeight;
    }
}
