package com.example.kishkispringa.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    private static final String TARGET_BEAN_NAME = "myBean";

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("BeanDefinitionRegistryPostProcessor: Парсинг конфигурации и создание BeanDefinition");
        for (String beanName : registry.getBeanDefinitionNames()) {
            if(beanName.equalsIgnoreCase(TARGET_BEAN_NAME)) {
                System.out.println("Найден BeanDefinition: " + beanName);
            }
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanDefinitionRegistryPostProcessor: Настройка BeanDefinition");
    }
}
