package com.technoapp.wmf.dbtest;

/**
 * Created by jhull3341 on 3/30/2016.
 */
public class eqCustomGaits_dt {
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGait() {
        return Gait;
    }

    public void setGait(String gait) {
        Gait = gait;
    }

    public Integer getPace() {
        return pace;
    }

    public void setPace(Integer pace) {
        this.pace = pace;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String category;
    private String Gait;
    private Integer pace;
    private String uom;

}
