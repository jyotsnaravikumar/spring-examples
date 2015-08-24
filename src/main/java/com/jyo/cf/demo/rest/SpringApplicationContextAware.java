package com.jyo.cf.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Jyotsna R on 1/20/15.
 */
@Service
public class SpringApplicationContextAware implements ApplicationContextAware {

    private static ApplicationContext context;
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @PostConstruct
    public void init(){
        log.debug("SpringAppicationContextAware initialized!!!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;

    }

    public static Object getBean(String beanName) {
        return context.getBean(beanName);
    }

    public static String getApplicationName() {
        return context.getApplicationName();
    }
}
