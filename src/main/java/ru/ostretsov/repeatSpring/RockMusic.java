package ru.ostretsov.repeatSpring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> list2 = new ArrayList<>();
    {
        list2.add("Wind cries Mary");
        list2.add("Highway to hell");
        list2.add("Nothing else matter");
    }


    @Override
    public List<String> getSongs() {
        return list2;
    }
}
