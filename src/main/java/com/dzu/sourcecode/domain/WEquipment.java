package com.dzu.sourcecode.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Classname WEquipment
 * @Description TODO
 * @Date 2021/3/3 19:46
 * @Created by ZhaoDong
 *
 */
//设备表
public class WEquipment {

    /** 设备ID */
    private String objId;

    /** 设备名称 */
    private String mc;

    /** 安装日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date azrq;

    /** 设备类型 */
    private String sblx;

    /** 是否在用 */
    private String sfzy;

    /** 所属电站 */
    private String ssbm;

    /** 是否已维修 */
    private String sfwx;

    /** 使用说明 */
    private String sysm;

    public WEquipment() {
    }

    public WEquipment(String objId, String mc, Date azrq, String sblx, String sfzy, String ssbm, String sfwx, String sysm) {
        this.objId = objId;
        this.mc = mc;
        this.azrq = azrq;
        this.sblx = sblx;
        this.sfzy = sfzy;
        this.ssbm = ssbm;
        this.sfwx = sfwx;
        this.sysm = sysm;
    }

    @Override
    public String toString() {
        return "WEquipment{" +
                "objId='" + objId + '\'' +
                ", mc='" + mc + '\'' +
                ", azrq=" + azrq +
                ", sblx='" + sblx + '\'' +
                ", sfzy='" + sfzy + '\'' +
                ", ssbm='" + ssbm + '\'' +
                ", sfwx='" + sfwx + '\'' +
                ", sysm='" + sysm + '\'' +
                '}';
    }
    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public Date getAzrq() {
        return azrq;
    }

    public void setAzrq(Date azrq) {
        this.azrq = azrq;
    }

    public String getSblx() {
        return sblx;
    }

    public void setSblx(String sblx) {
        this.sblx = sblx;
    }

    public String getSfzy() {
        return sfzy;
    }

    public void setSfzy(String sfzy) {
        this.sfzy = sfzy;
    }

    public String getSsbm() {
        return ssbm;
    }

    public void setSsbm(String ssbm) {
        this.ssbm = ssbm;
    }

    public String getSfwx() {
        return sfwx;
    }

    public void setSfwx(String sfwx) {
        this.sfwx = sfwx;
    }

    public String getSysm() {
        return sysm;
    }

    public void setSysm(String sysm) {
        this.sysm = sysm;
    }
}
