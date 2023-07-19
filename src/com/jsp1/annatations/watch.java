package com.jsp1.annatations;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("w2")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class watch
{
@Value("rolex")
	private String brand;
 @Value("5500")
	private double price;

// to display the time
		 public void displayTime()
		 {
			 Date date=new Date();
			 SimpleDateFormat sm=new SimpleDateFormat("hh:mm:ss");
			 System.out.println("Time :"+sm.format(date));
			
		
	}
		 
		@Override
		public String toString() 
		{
			return "watch [brand=" + brand + ", price=" + price + "]";
		}
		 
		public watch(@Value("rolex") String brand,@Value("5500") double price)  
		{
			super();
			this.brand = brand;
			this.price = price;
			
			System.out.println("constructor with  2 arguments of watch class");
			 System.out.println();

		}
}
