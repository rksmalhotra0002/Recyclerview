package com.example.shubham1.gridrecyclerview.model;

public class Model {
    private String name,colortheory,desc,learnmore;


    public Model(String name, String colortheory, String desc, String learnmore)
    {
        this.name=name;
        this.colortheory=colortheory;
        this.desc=desc;
        this.learnmore=learnmore;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColortheory() {
        return colortheory;
    }

    public void setColortheory(String colortheory) {

        this.colortheory = colortheory;
    }

    public String getDesc() {
        return desc;

    }

    public void setDesc(String desc) {

        this.desc = desc;

    }

    public String getLearnmore() {
        return learnmore;
    }

    public void setLearnmore(String learnmore) {
        this.learnmore = learnmore;
    }

}
