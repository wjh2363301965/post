package com.wjh.domain;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    //评论表
    //主键
    private int id;
    //姓名
    private String name;
    //评论内容
    private String replyMessage;
    //创建时间
    private Date creatTime;
    //状态
    private int status;
    //标记  1 一级评论（帖子的评论） 2 二级评论（评论的评论）
    private int mark;
    //connect表的外键
    private int cid;

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

    public String getReplyMessage() {
        return replyMessage;
    }

    public void setReplyMessage(String replyMessage) {
        this.replyMessage = replyMessage;
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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", replyMessage='" + replyMessage + '\'' +
                ", creatTime=" + creatTime +
                ", status=" + status +
                ", mark=" + mark +
                ", cid=" + cid +
                '}';
    }
}
