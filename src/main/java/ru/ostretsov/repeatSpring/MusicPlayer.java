package ru.ostretsov.repeatSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sun.font.DelegatingShape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.volume}")
    private int volume;
    @Value("${musicPlayer.name}")
    private String name;

    List<Music> musicList;


    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }


    public MusicPlayer(List<Music> musicList) {
        this.musicList= musicList;
    }

    public String playMusic() {
        Random random = new Random();
        return "Playing " + musicList.get(random.nextInt(musicList.size())).getSong();
    }
}
