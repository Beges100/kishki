package com.example.kishkispringa.test;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public MyBean() {
        System.out.println("Конструктор MyBean вызван");
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct: бин инициализирован");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("@PreDestroy: бин уничтожается");
    }
}
