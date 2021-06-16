package ru.ostretsov.repeatSpring;

public class ClassicalMusic  implements Music{
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
