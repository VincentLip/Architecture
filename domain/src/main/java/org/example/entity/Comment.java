package org.example.entity;

public class Comment {

    private int id;
    private String title;
    private String content;

    public Comment() {
    }

    public Comment(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
