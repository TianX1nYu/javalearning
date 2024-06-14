package com.powernode.spring6.bean;

/**
 * packageName com.powernode.spring6.bean
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className HusBand
 * @date 2024/6/11
 * @description TODO
 */
public class HusBand {
    private String name;
    private Wife wife;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "HusBand{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}