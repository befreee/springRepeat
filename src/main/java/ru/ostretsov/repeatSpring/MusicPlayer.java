package ru.ostretsov.repeatSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sun.font.DelegatingShape;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private PopMusic popMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, PopMusic popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public void playMusic(MusicGenre musicGenre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (musicGenre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else if (musicGenre == MusicGenre.ROCK) {
            System.out.println(rockMusic.getSongs().get(randomNumber));
        } else {
            System.out.println(popMusic.getSongs().get(randomNumber));
        }
    }
}
