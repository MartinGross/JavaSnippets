package de.datazoo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * A simple spring framework example
 */
public class SpringConfigurator {

    public static void main(String[] args) {

        // create and configure beans
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"services.xml"});

        ExampleObject exampleObject = context.getBean("exampleObject", ExampleObject.class);
        
        long time = exampleObject.getTimeout();
        System.out.println("timeout was set to = " + time);

    }

}
