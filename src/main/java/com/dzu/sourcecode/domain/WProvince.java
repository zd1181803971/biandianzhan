package com.dzu.sourcecode.domain;

/**
 * @Classname WProvince
 * @Description TODO
 * @Date 2021/3/3 19:53
 * @Created by ZhaoDong
 */

//网省表
public class WProvince {
    /** 网省编号 */
    private String proid;

    /** 网省名称 */
    private String proname;

    /** 上级单位 */
    private String parproid;

    /** 单位描述 */
    private String proartdesc;

    /** 用电量 */
    private String powercon;

    public WProvince() {
    }

    public WProvince(String proid, String proname, String parproid, String proartdesc, String powercon) {
        this.proid = proid;
        this.proname = proname;
        this.parproid = parproid;
        this.proartdesc = proartdesc;
        this.powercon = powercon;
    }

    @Override
    public String toString() {
        return "WProvince{" +
                "proid='" + proid + '\'' +
                ", proname='" + proname + '\'' +
                ", parproid='" + parproid + '\'' +
                ", proartdesc='" + proartdesc + '\'' +
                ", powercon='" + powercon + '\'' +
                '}';
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getParproid() {
        return parproid;
    }

    public void setParproid(String parproid) {
        this.parproid = parproid;
    }

    public String getProartdesc() {
        return proartdesc;
    }

    public void setProartdesc(String proartdesc) {
        this.proartdesc = proartdesc;
    }

    public String getPowercon() {
        return powercon;
    }

    public void setPowercon(String powercon) {
        this.powercon = powercon;
    }
}
