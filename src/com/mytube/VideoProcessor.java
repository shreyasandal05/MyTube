package com.mytube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailService notificationService;

    public VideoProcessor(VideoEncoder encoder,VideoDatabase database,EmailService email) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = email;
    }
    public void process(Video video){
        encoder.encode(video);
        database.store(video);
        notificationService.notify(video.getUser());
    }
}
