package ru.ostretsov.repeatSpring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.ostretsov.repeatSpring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
