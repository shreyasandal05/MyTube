package com.mytube;

public class Video {
    private String filename;
    private String title;
    private User user;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
        System.out.println(filename);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println(title);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user=user;
        System.out.println(user);
    }
}
