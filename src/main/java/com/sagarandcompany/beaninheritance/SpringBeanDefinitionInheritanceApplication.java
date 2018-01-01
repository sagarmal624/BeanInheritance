package com.sagarandcompany.beaninheritance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBeanDefinitionInheritanceApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBeanDefinitionInheritanceApplication.class, args);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Elephant elephant = (Elephant) applicationContext.getBean("elephant");
        System.out.print(elephant.toString());
    }
}
