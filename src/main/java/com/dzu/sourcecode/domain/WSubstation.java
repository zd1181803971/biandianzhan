package com.dzu.sourcecode.domain;

/**
 * @Classname WSubstation
 * @Description TODO
 * @Date 2021/3/3 19:54
 * @Created by ZhaoDong
 */
//变电站表
public class WSubstation {
    /** 变电站ID */
    private String id;

    /** 所属网省 */
    private String proid;

    /** 变电站名称 */
    private String wSubstationmc;

    public WSubstation() {
    }

    public WSubstation(String id, String proid, String wSubstationmc) {
        this.id = id;
        this.proid = proid;
        this.wSubstationmc = wSubstationmc;
    }

    @Override
    public String toString() {
        return "WSubstation{" +
                "id='" + id + '\'' +
                ", proid='" + proid + '\'' +
                ", wSubstationmc='" + wSubstationmc + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public String getwSubstationmc() {
        return wSubstationmc;
    }

    public void setwSubstationmc(String wSubstationmc) {
        this.wSubstationmc = wSubstationmc;
    }
}
