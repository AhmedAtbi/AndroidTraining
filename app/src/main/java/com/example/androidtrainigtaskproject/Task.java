package com.example.androidtrainigtaskproject;

public class Task {
    private int id;
    private String desc,title;

    public Task(int id, String title, String desc) {
        this.id = id;
        this.desc = desc;
        this.title = title;
    }
    public Task() {
    }

    public Task(String title, String desc) {
        this.desc = desc;
        this.title = title;
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
}
