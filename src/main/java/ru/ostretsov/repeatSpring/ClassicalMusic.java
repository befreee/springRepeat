package ru.ostretsov.repeatSpring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic  implements Music{
    private ClassicalMusic(){
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Init method is called");
    }

    public void doMyDestroy(){
        System.out.println("Destroy method is called");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
