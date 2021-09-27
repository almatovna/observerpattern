package com.company;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IObservable{
    List<Video> videos = new ArrayList<>();
    List<IObserver> observers = new ArrayList<>();

    public void addVideo(Video video) {
        this.videos.add(video);
        notifyAllObservers();
    }

    public void removeVideo(String videos) {
        this.videos.remove(videos);
        notifyAllObservers();
    }

    @Override
    public void subscribeObserver(IObserver observer) { observers.add(observer); }

    @Override
    public void unsubscribeObserver(IObserver observer) { observers.remove(observer); }

    @Override
    public void notifyAllObservers() { for (IObserver observer : observers) observer.update(videos); }
}
