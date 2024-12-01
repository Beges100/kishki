package com.example.kishkispringa.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    private static final String TARGET_BEAN_NAME = "myBean";
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equalsIgnoreCase(TARGET_BEAN_NAME)) {
            System.out.println("BeanPostProcessor (Before Initialization): " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equalsIgnoreCase(TARGET_BEAN_NAME)) {
            System.out.println("BeanPostProcessor (After Initialization): " + beanName);
        }

        return bean;
    }
}
