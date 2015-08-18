package com.tecnotree.jmstuts.topic;

import java.util.Calendar;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.tecnotree.jms.controller.DoAction;

public class MyTopicProducer implements DoAction{

	private static Logger log = Logger.getLogger(MyTopicProducer.class);
	public JmsTemplate jmsTemplate;

	public void produceMessage(){
		jmsTemplate.send(new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				log.info("Sending Message to Topic");
				TextMessage message = session.createTextMessage();
				message.setJMSMessageID("ID:"+Calendar.getInstance().getTime().getTime());
				message.setText("New Topic Message : Today's News");
				return message;
			}
		});
	}
	
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	@Override
	public void doAction() {
		try{
			log.info("Calling produceMessage()");
			produceMessage();
		}catch(Exception exception){
			log.error("Exception : " + exception.getMessage());
		}
		
	}

}
