package com.auribox.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.auribox.model.Message;

public class MainApp {

	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* utilizando clase message
		Message message = new Message();
		message.setHeader("Main Header");
		message.setPayload("Main Payload");
		System.out.println(message);
		*/
		
		/*utilizando contexto */
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-ctx.xml");
		
		Message message = (Message)ctx.getBean("message");
		
		System.out.println(message);
		
		message.setHeader("Modificado");

		Message message2 = (Message)ctx.getBean("message");
		
		System.out.println(message2);
		
		Message message3 = (Message)ctx.getBean("message2");
		
		System.out.println(message3);

		Message message4 = (Message)ctx.getBean("message3");
		
		System.out.println(message4);
		
		Message message5 = (Message)ctx.getBean("message4");
		
		System.out.println(message5);

		//ctx.close();

		
	}

}
