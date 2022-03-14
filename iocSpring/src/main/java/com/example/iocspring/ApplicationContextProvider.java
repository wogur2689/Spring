package com.example.iocspring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext; //어플리케이션 컨텍스트에 주입된 값을 컨텍스트에 저장.
    }

    public static ApplicationContext getContext() {
        return context; //호출시 컨텍스트를 반환.
    }
}
