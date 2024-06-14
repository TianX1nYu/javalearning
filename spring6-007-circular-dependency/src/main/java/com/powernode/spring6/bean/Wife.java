package com.powernode.spring6.bean;

/**
 * packageName com.powernode.spring6.bean
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className Wife
 * @date 2024/6/11
 * @description TODO
 */
public class Wife {
    private String name;
    private HusBand husBand;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHusBand(HusBand husBand) {
        this.husBand = husBand;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husBand=" + husBand.getName() +
                '}';
    }
}