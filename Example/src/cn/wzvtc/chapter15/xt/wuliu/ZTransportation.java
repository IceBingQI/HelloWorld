package cn.wzvtc.chapter15.xt.wuliu;
/**
 * 专用运输车辆
 */
public class ZTransportation extends Transportation implements Careable{

    public ZTransportation() {
    }

    public ZTransportation(String number, String model, String admin) {
        super(number, model, admin);
    }
    /**
     * 运输方法
     */
    @Override
    public void transport() {
        System.out.println("运输中...");
    }
    /**
     * 保养方法
     */
    @Override
    public void upkeep() {
        System.out.println("车辆保养...");
    }
}
