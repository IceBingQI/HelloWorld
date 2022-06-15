package cn.wzvtc.chapter15.xt.wuliu;

/**
 * 交通工具类
 */
public abstract class Transportation {
    /**
     * 编号
     */
    private String number;
    /**
     * 型号
     */
    private String model;
    /**
     * 运货负责人
     */
    private String admin;
    /**
     * 运送方法
     */
    public abstract void transport();

    public Transportation(String number, String model, String admin) {
        this.number = number;
        this.model = model;
        this.admin = admin;
    }

    public Transportation() {
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getAdmin() {
        return admin;
    }
}
