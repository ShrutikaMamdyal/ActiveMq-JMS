package com.ctrlf.jmsdemo;

public class SiteDAO {
	
	MessagePublisher messagePublisher=null;
	
	

	public MessagePublisher getMessagePublisher() {
		return messagePublisher;
	}



	public void setMessagePublisher(MessagePublisher messagePublisher) {
		this.messagePublisher = messagePublisher;
	}



	public void processBatch() {
		//Just for demo , processing 100 sites parallely using JMS
		BranchVO branchVO=new BranchVO();
	for (int i = 0; i < 1000; i++) {
		branchVO.setContractorid(i);
		messagePublisher.sendMessage(branchVO);
	}
	}

}
