package com.tecnotree.jmstuts;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.log4j.Logger;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.tecnotree.jms.controller.DoAction;

public class JMSQueueSender implements DoAction{

	private static Logger log = Logger.getLogger(JMSQueueSender.class);
			
	JmsTemplate jmsTemplate;

	public void sendMessage(){
		jmsTemplate.send(new MessageCreator(){
			@Override
			public Message createMessage(Session arg0) throws JMSException {
				log.info("Sending Text Message : A Text Message");
				return arg0.createTextMessage("A Text Message");
			}
		});
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	@Override
	public void doAction() {
		try{
			sendMessage();
		}catch(Exception exception){
			log.error("Exception : " + exception.getMessage());
		}
		
	}

}
