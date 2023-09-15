package com.p4n;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandaler
implements ApplicationListener<ContextStoppedEvent>{

	   public void onApplicationEvent(ContextStoppedEvent event) {
	      System.out.println("ContextStoppedEvent Received");
	   }

}
