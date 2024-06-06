package in.swadhin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.swadhin.bean.student;
import in.swadhin.confige.config;

public class main 
{
	public static void main(String[] args) 
	{
	    ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
	    		student std=(student)context.getBean("student");
	    		std.display();
	}

}
