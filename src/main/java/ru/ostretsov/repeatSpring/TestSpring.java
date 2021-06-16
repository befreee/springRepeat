package ru.ostretsov.repeatSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer2.playMusic();

        boolean compare = musicPlayer2==musicPlayer1;
        System.out.println(compare);
        musicPlayer1.setVolume(10);
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());

        System.out.println("Player name is: " + musicPlayer2.getName() + " and volume is: " + musicPlayer2.getVolume());
        System.out.println();

    }
}
