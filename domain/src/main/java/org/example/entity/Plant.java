package org.example.entity;

import java.util.List;

public class Plant {

    private int id;
    private String name;
    private String description;
    private String url;
    private String detail;
    private int level;

    private List<Comment> commentList;

    public Plant() {
    }

    public Plant(String name, String description, String url, String detail) {
        this.name = name;
        this.description = description;
        this.url = url;
        this.detail = detail;
    }

    public Plant(int id, String name, String description, String url, String detail) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.detail = detail;
    }

    public int getLevel() {
        return level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getDetail() {
        return detail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}

