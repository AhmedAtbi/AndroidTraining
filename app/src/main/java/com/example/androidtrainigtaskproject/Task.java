package com.example.androidtrainigtaskproject;

public class Task {
    private int id;



    private int color;
    private String title,desc;

    public Task(int id, String title, String desc,int color) {
        this.id = id;
        this.desc = desc;
        this.title = title;
        this.color = color;
    }
    public Task() {
    }

    public Task(String title, String desc) {
        this.desc = desc;
        this.title = title;
        
    }

    public Task(String title, String desc,int color) {
        this.desc = desc;
        this.title = title;
        this.color=color;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
