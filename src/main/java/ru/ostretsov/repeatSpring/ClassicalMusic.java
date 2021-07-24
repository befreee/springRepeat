package ru.ostretsov.repeatSpring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic  implements Music{
    private List<String> list = new ArrayList<>();

    {
        list.add("Hungarian Rhapsody");
        list.add("Simphony #5");
        list.add("Capella");
    }

    @Override
    public List<String> getSongs() {
        return list;
    }
}