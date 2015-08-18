package com.tecnotree.jmstuts;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;
import org.springframework.jms.core.JmsTemplate;

import com.tecnotree.jms.controller.DoAction;

public class JMSQueueReceiver implements DoAction{

	private static Logger log = Logger.getLogger(JMSQueueReceiver.class);
			
	JmsTemplate jmsTemplate;
	
	public void onMessage() throws JMSException {
		TextMessage message = (TextMessage)jmsTemplate.receive();
		if(message == null){
			log.error(new NoMessageThereSir().getMessage());
		}else{
			log.info("Received Text Message : " + message.getText());
		}
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	@Override
	public void doAction() {
		try{
			onMessage();
		}catch(Exception exception){
			log.error("Exception : " + exception.getMessage());
		}
		
	}
	
	class NoMessageThereSir extends Exception{
		@Override
		public String getMessage() {
			return "Could not get any message from queue, maybe the queue is empty.";
		}
	}
	
}
