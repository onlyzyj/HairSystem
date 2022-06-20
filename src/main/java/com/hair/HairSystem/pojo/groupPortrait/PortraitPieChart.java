package com.hair.HairSystem.pojo.groupPortrait;

import javax.persistence.*;

@Table(name = "portraitPieChart")
public class PortraitPieChart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "listId")
    private Integer listId;
    @Column(name = "groupName")
    private String groupName;
    @Column(name = "groupNum")
    private int groupNum;

    @Override
    public String toString() {
        return "PortraitPieChart{" +
                "id=" + id +
                ", listId=" + listId +
                ", groupName='" + groupName + '\'' +
                ", groupNum=" + groupNum +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }
}
