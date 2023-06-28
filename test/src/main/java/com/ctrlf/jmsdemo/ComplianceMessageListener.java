package com.ctrlf.jmsdemo;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQObjectMessage;

public class ComplianceMessageListener implements MessageListener {
	public void onMessage(Message message) {
		
			try {
				/*
				String siteId = ((TextMessage) message).getText();
				System.out.println("Got "+siteId);
				*/
				//BranchVO branchVO= (BranchVO) ((ObjectMessage) message).getObject();
				BranchVO msgObj= (BranchVO) ((ObjectMessage) message).getObject();
				System.out.println("Got Object");
				
				System.out.println(" QueueData : \nContractorId" + msgObj.getContractorid());
				
				Thread.sleep(5000);
			} catch (JMSException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
}
