package ru.ostretsov.repeatSpring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Scope("prototype")
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