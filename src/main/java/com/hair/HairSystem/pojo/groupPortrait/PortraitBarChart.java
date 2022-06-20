package com.hair.HairSystem.pojo.groupPortrait;

import javax.persistence.*;

@Table(name = "portraitBarChart")
public class PortraitBarChart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "pieId")
    private Integer pieId;
    private String feature;
    private Double value;

    @Override
    public String toString() {
        return "PortraitBarChart{" +
                "id=" + id +
                ", pieId=" + pieId +
                ", feature='" + feature + '\'' +
                ", value=" + value +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPieId() {
        return pieId;
    }

    public void setPieId(Integer pieId) {
        this.pieId = pieId;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
