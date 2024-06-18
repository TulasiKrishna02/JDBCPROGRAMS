package javaConfig.com.tulasi.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.durgasoft.beans.Hello;
import com.durgasoft.beans.Welcome;
import com.durgasoft.config.AppConfig;

public class App {
	   public static void main(String[] args) throws Exception{
	       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);


	       Hello hello = (Hello) applicationContext.getBean("hello");
	       System.out.println(hello.sayHello());


	       Welcome welcome = (Welcome) applicationContext.getBean("welcomeBean");
	       System.out.println(welcome.sayWelcome());
	   }
	}