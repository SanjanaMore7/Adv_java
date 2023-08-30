package com.p4n;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanScopesApplication {

	public static void main(String[] args) {
		 //SpringApplication.run(BeanScopesApplication.class, args);
		 ApplicationContext context = new AnnotationConfigApplicationContext(BeanScopesApplication.class);
		 SingletonBean singleton1 = context.getBean(SingletonBean.class);
	     SingletonBean singleton2 = context.getBean(SingletonBean.class);

	     System.out.println("Are singleton beans the same? " + (singleton1 == singleton2));

	     PrototypeBean prototype1 = context.getBean(PrototypeBean.class);
	     PrototypeBean prototype2 = context.getBean(PrototypeBean.class);

	     System.out.println("Are prototype beans the same? " + (prototype1 == prototype2));
	     
	}

}
