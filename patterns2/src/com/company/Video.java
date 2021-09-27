package com.company;

public class Video {
    private String videoName;
    private String time;

    public Video(String videoName, String time) {
        setVideoName(videoName);
        setTime(time);
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "\n" + getVideoName() + "\n" + getTime();
    }
}
