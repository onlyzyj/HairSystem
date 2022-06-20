package com.hair.HairSystem.pojo.groupPortrait;

import javax.persistence.*;

@Table(name = "portraitFeature")
public class PortraitFeature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "listId")
    private Integer listId;
    private String feature;

    @Override
    public String toString() {
        return "PortraitFeature{" +
                "id=" + id +
                ", listId=" + listId +
                ", feature='" + feature + '\'' +
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

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
