package ru.ostretsov.repeatSpring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class PopMusic  implements Music{
    private List<String> list3 = new ArrayList<>();
    {
        list3.add("Despasito");
        list3.add("Cadilac");
        list3.add("I will survive");
    }

    @Override
    public List<String> getSongs() {
        return list3;
    }
}
