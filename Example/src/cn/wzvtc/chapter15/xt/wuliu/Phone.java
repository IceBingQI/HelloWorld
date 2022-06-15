package cn.wzvtc.chapter15.xt.wuliu;

/**
 * 手机类进行定位
 */
public class Phone implements GPS{
    /**
     * 定位方法
     * @return
     */
    @Override
    public String showCoordinate() {
        return "193,120";
    }
}
