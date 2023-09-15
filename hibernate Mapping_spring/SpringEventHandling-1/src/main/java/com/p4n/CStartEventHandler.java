package com.p4n;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent>{	            
	  
    public void onApplicationEvent(ContextStartedEvent event) {
	      System.out.println("ContextStartedEvent Received");
	   } 

}
