package com.example.kishkispringa.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class ShutdownHookBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean: контекст закрыт");
    }
}
