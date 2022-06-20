package com.hair.HairSystem.pojo.groupPortrait;

import javax.persistence.*;

@Table(name = "portraitlist")
public class PortraitList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer pid;
    @Column(name = "portraitName")
    private String portraitName;

    @Override
    public String toString() {
        return "PortraitList{" +
                "id=" + id +
                ", pid=" + pid +
                ", portraitName='" + portraitName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPortraitName() {
        return portraitName;
    }

    public void setPortraitName(String portraitName) {
        this.portraitName = portraitName;
    }
}
