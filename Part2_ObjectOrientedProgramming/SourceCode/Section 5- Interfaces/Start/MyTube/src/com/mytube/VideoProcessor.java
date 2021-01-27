package com.mytube;

public class VideoProcessor {
    private CanVideoEncoder encoder;
    private CanVideoDatabase database;
    private CanEmailService emailService;

    public VideoProcessor(CanVideoEncoder encoder, CanVideoDatabase database,
        CanEmailService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }


    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

