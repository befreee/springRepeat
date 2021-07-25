package ru.ostretsov.repeatSpring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class PopMusic  implements Music{

    @Override
    public String getSong() {
        return "I will survive";
    }
}
