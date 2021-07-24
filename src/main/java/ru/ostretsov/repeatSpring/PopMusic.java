package ru.ostretsov.repeatSpring;

import org.springframework.stereotype.Component;

@Component
public class PopMusic  implements Music{
    @Override
    public String getSong() {
        return "Despasito";
    }
}
