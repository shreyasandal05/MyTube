package com.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFilename("Birthday.mp4");
        video.setTitle("Lisbon's Birthday");
        video.setUser(new User("john@gmail.com".toString()));

        var processor = new VideoProcessor(new XVideoEncoder(), new SqlVideoDatabase(),new NotificationService());
        processor.process(video);
    }
}
