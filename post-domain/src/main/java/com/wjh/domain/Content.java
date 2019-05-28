package com.wjh.domain;

import java.io.Serializable;
import java.util.Date;

public class Content implements Serializable {
    //内容表
    //主键
    private int id;
    //姓名
    private String name;
    //内容标题
    private  String title;
    //内容
    private String detail;
    //创建时间
    private Date creatTime;
    //状态 0 关闭 1开启
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", creatTime=" + creatTime +
                ", status=" + status +
                '}';
    }
}
