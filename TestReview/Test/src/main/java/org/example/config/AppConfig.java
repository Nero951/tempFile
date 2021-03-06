package org.example.config;

import org.example.model.LifeCycleTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Wade
 */
@Configuration
public class AppConfig implements BeanPostProcessor {
    @Bean(initMethod = "beanInit", destroyMethod = "beanDestroy")
    public LifeCycleTest lifeCycleTest(){
        return new LifeCycleTest();
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String
            beanName) throws BeansException {
        System.out.println("BeanPostProcessor Before");
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String
            beanName) throws BeansException {
        System.out.println("BeanPostProcessor After");
        return bean;
    }
}
