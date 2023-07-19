package com.jsp1.annatations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class application 
{
  public static void main(String[] args) 
  {
	ApplicationContext context=new ClassPathXmlApplicationContext("confi.com");
	watch watch1=context.getBean("w2",watch.class);
	System.out.println(watch1);
    watch1.displayTime();
}
}
