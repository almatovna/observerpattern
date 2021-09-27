package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        Channel channel1 = new Channel();
        Channel channel2 = new Channel();
        Channel channel3 = new Channel();

        User user1 = new User("Gera");
        User user2 = new User("Dari");
        User user3 = new User("Dayana");
        User user4 = new User("Aigera");

        channel1.subscribeObserver(user1);
        channel2.subscribeObserver(user2);
        channel2.subscribeObserver(user3);
        channel3.subscribeObserver(user4);


        channel1.addVideo(new Video("Why are patterns important?", "1:01:20"));
        channel2.addVideo(new Video("How to be a good programmer?", "2:03:35"));
        channel3.addVideo(new Video("Get muscles in 2 weeks!", "00:45:20"));

        channel2.unsubscribeObserver(user3);
        channel2.addVideo(new Video("5 myths about programming", "00:30:40"));

    }
}
