package com.ctrlf.jmsdemo;
import javax.jms.Destination;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class MessagePublisher {
	
	private JmsTemplate jmsTemplate; 
	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	public void sendMessage(final BranchVO branchVO) 
	{ 
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("applictaionContext.xml");

		Destination dest=(Destination) context.getBean("destination");
		*/
		jmsTemplate.convertAndSend(branchVO); 
		System.out.println("Message Sent");
		
	}

}
