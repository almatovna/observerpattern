package com.company;

import java.util.List;

public class User implements IObserver{
    private String name;

    public User(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(List<Video> notifications) {
        System.out.println("Dear " + getName() + ", you have a new notification from YouTube!\n" + notifications.toString() + '\n');
    }
}
